package com.aliemressman.classes.Class

interface Print2 {
    fun onPrint()
}

abstract class User(val age : Int) {
     open fun getUserFullName(){}
}
//fulNameden sonra : User yapmamızın sebebi birden fazla super type olduğu için fullNamenin tipini belirtmek. (class mı olacak interface mi olacak)
val fullName : User = object : User(18), Print2 {
    val firstName = "Ali"
    val surName = "Emressman"

    override fun onPrint() {
        println("Full name = $firstName $surName")
        //onPrint Fonksiyonunu override etsek bile fullName değişkeni class olduğu için main fonksiyonunda ulaşamayız.
    }
    // Open olduğu için override edilebilir. zorunlu değil.
    override fun getUserFullName() {
        super.getUserFullName()
    }
    override fun toString(): String {
        return "$firstName $surName"
    }
}

fun main() {
    // fullName.onPrint() BUNA ULAŞAMAYIZ. Çünkü fullName değişkeni User class'ıdır.
    fullName.getUserFullName()
    println("Full name = $fullName")
}