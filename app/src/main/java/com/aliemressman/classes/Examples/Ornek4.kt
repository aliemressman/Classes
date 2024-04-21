package com.aliemressman.classes.Examples

class Ogrenci(private val name : String, private val yas : Int, private val not : Int) {
    fun notOrtalama() :Int {
        return not/5
    }
}

fun main() {
    val ogrenci = Ogrenci("Ali", 18, 55)
    println("Öğrencinin not ortalaması = ${ogrenci.notOrtalama()}")
}