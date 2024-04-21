package com.aliemressman.classes.Class

import java.lang.reflect.Field

class WallPaper() {

    // ARKADAŞLAR İMAGEURL HER ZAMAN 2.DEĞİŞKEN OLMALI. ÇÜNKÜ REFLECTİON DA KULLANILIYOR.

    private val id: Int = 656
    private val imageUrl: String = "https://www.google.com.tr"
    private val type: Int = 1
    private val widht: Int = 1920
    private val height: Int = 1080
    private val isGif: Boolean = false
    private val previewUrl: String = "https://www.google.com.tr"

    private fun print(){

    }
}

fun main() {
    val wallPaper = WallPaper()

    val imageUrlField: Field = wallPaper.javaClass.getDeclaredField("imageUrl")
    // Üstteki kullanım ile alttaki kullanım aynıdır.
    val imageUrlFieldName = wallPaper.javaClass.declaredFields[1].name
    val imageUrlField2 = wallPaper.javaClass.getDeclaredField(imageUrlFieldName)
    imageUrlField.isAccessible = true
    imageUrlField2.isAccessible = true

    val imageUrlString = imageUrlField.get(wallPaper)
    val imageUrlString2 = imageUrlField2.get(wallPaper)
    println(imageUrlString)
    println(imageUrlString2)
}