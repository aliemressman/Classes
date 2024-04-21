package com.aliemressman.classes.Examples

class Dikdortgen(private val yukseklik: Int, private val genislik: Int) {
    fun alanHesapla() {
        println("Dikdörtgenin alanı = ${yukseklik * genislik}")
    }
}

fun main() {
    val diktorgen = Dikdortgen(5 , 6)
    diktorgen.alanHesapla()
}