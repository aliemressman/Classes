package com.aliemressman.classes.Class

interface myInterface {
    val prop : Int // abstract property

    val propertyWithImplementation : String
        get() = "foo"
    /** propertyWithImplementation adında bir property tanımladık ve bu property'nin getter'ı
    bu bir değişken olmadığı için değer verebildik.
    */

    fun foo() {
        println(prop)
    }
    fun foo2()

    abstract fun bar()
    // abstract olabilir.

    /**
    interfacelerde tanımlanan propertylerde initial deger alma zorunluluğu yoktur.
     */
    interface Named {
        val fullName : String?
        // val fullName : String? = "sfgs" hata verir
    }

    interface Person : Named {
        val firstName : String
        val lastName : String

        override val fullName : String?
            get() = "$firstName $lastName"
    }
}

class Employeed : myInterface.Person {
    override val firstName: String
        get() = "Ali"
    override val lastName: String
        get() = "Emre"

    override val fullName: String?
        get() = super.fullName
}

//constructor içindede override yapılabilir.
class Child(override val prop: Int = 55) : myInterface {
    override fun foo() {
        super.foo()
        println("child")
    }
    override fun foo2() {
       // super.foo2() yapamıyoruz çünkü foo2nin body'si yok.
    }

    override fun bar() {
        // super.bar() yapamıyoruz çünkü bar ın body'si yok.
    }
}

interface A {
    fun foo() {
        println("A")
    }
    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }
    fun bar() {
        println("bar")
    }
}

class C : A {
    override fun bar() {
        println("bar")
    }

    /**
    override fun foo() {
    super.foo()
    }               İSTEĞE BAĞLI OVERRİDE EDEBİLİRİZ.
     **
      */
}

open class E() {
   // abstract fun fsdafsd()
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
    override fun bar() {
        // super<A>.bar() A interfacesinin bar fonksiyonunun body si yok. Dolayısıyla super ile erişilemez.
        super<B>.bar()
        super.bar()
    }
}