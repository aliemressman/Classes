package com.aliemressman.classes.Class

class Car (whellCount : Int , color : String = "Red") {
    private var mWhellCount: Int = whellCount
    private val mColor = color

    // init bloğu primary constructorun içindeki değişkenlerin ilk değerlerini atamak için kullanılır.
    // bir classın primary constructoru olmadan init bloğu oluşturulamaz.
    init {
        mWhellCount = whellCount
        println("primary constructor created")
        println("Whellcount : $mWhellCount, Color : $mColor")
    }

    constructor(whellCount: Int, color: String = "Red", name: String) : this(whellCount, color) {
        // Secondary constructorlar this ile primary constructoru çağırmak zorundadır.
        // Bu yüzden Classı çağırırken önce init bloğuna girer sonra secondary constructora girer.
        println("1. secondary constructor created")
        println("Whellcount : $mWhellCount, Color : $mColor, Name : $name")
    }

    constructor(
        whellCount: Int,
        color: String = "Red",
        name: String? = null,
        madeOf: String? = null
    ) : this(whellCount,color) {
        println("2. secondary constructor created")
        println("Whellcount : $mWhellCount, Color : $mColor, Name : $name, MadeOf : $madeOf")

        if (name == null) {
            return
        }

        if (madeOf == null) {
            return
        }
    }
}
// Primary Constructor ın beklediği değerleri vermeye devam edersek hep ilk önce init bloğu çalışır.

fun main() {
    val car0 = Car(4)
    // Primary Constructor çağırılmıştır.
    val car1 = Car(4, "Blue")
    // Primary Constructor çağırılmıştır.
    val car2 = Car(4, "Blue", "BMW")
    // 1. Secondary Constructor çağırılmıştır.
    val car3 = Car(4, "Blue", "BMW", "Iron")
    // 2. Secondary Constructor çağırılmıştır.
    val car4 = car(4, "Blue", "BMW", "Iron","fsfbg")
    // Car Fonksiyonu çağırılmıştır çünkü Car classı max 4 tane parametre alabilir.
}

fun car(i : Int , s : String, s1 : String, s2 : String, s3 : String) {
    println("Car created")
}