package com.aliemressman.classes.Class

class Outer {
    private val name = "Emre"
    val surname = "ŞİŞMAN"

    fun getAge() : Int = 18

    class NestedClass {

        fun printName() {
          //  name
          //  surname      NESTED CLASS OLDUĞU İÇİN BUNLARA ULAŞAMAYIZ.
         //  getAge()
        }
        fun printName(outer: Outer) {
            outer.name
            outer.surname   // BU ŞEKİLDE ULAŞABİLİRİZ
            outer.getAge()
        }
    }
}

interface OuterInterface {
    class DenemeA
    interface NestedInterface
}

class Outer2 {
    private val name = "Emre"
    val surname = "ŞİŞMAN"

    fun getAge() : Int = 18

    inner class InnerClass {
        fun printName() {
            name
            surname     // INNER CLASS OLDUĞU İÇİN DİREKT OLARAK ULAŞABİLİYORUM.
            getAge()
        }
    }
}

fun main() {
    val outer = Outer()
    outer.getAge()
    outer.surname
    // outer.name

    Outer.NestedClass().printName()
    //Outer().NestedClass().printName()


    Outer2().surname
    Outer2().getAge()
    //outer2.name
    Outer2().InnerClass().printName()
}