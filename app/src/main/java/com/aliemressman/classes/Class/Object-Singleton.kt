package com.aliemressman.classes.Class

object ProfileKotlin {
    var nickName : String? = null
    var counter : Int = 0
}

fun main() {

    ProfileKotlin.nickName = "Emre"

    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++

    println(ProfileKotlin.counter)
}