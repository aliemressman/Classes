package com.aliemressman.classes.Examples

class Car(val marka : String , val model : String , val year : Int) {
    fun carBilgiler() {
        println("Marka = $marka")
        println("Model = $model")
        println("Yıl = $year")
    }
}

fun main() {
    val car = Car("Audi", "A3", 2015)
    car.carBilgiler()
}