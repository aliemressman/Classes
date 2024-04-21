package com.aliemressman.classes.Examples

class Person (val name : String, val age : Int, val country: String) {
    fun printDetail() {
        println("name $name, age $age, country $country")
    }
}

fun main() {
    val person = Person("Emre", 18, "Turkiye")
    person.printDetail()
}