package com.aliemressman.classes.Class

import kotlin.properties.Delegates

class user85() {
     var name : String by Delegates.observable("initialized Value") { property, oldValue, newValue ->
         println("$oldValue -> $newValue")
     }
}

var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
    if (newValue > oldValue) true else throw IllegalArgumentException("New value must be greater than old value.")
    newValue > oldValue
}

var max2: Int by Delegates.observable(0) { property, oldValue, newValue ->
    true
}

fun main() {
    val user = user85()
    user.name = "first"
    user.name = "second"

    println(max) // 0

    max = 10
    println(max) // 10

    max = 5 // will fail with IllegalArgumentException
    println(max) // 10

    println("max2: $max2") // 0

    max2 = 10
    println("max2: $max2") // 10

    max2 = 5 // will fail with IllegalArgumentException
    println("max2: $max2") // 0

}
