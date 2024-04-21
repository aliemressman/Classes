package com.aliemressman.classes.Class

open class foo {

    private var longLine : Int = 1
    private var longLine2 : Int = 2
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4

    private fun print() {
        println("a: $a")
        println("b: $b")
        println("c: $c")
        println("d: $d")
    }

    fun calculateArea(longLine : Int, longLine2 : Int) : Int {
        this.longLine = longLine
        this.longLine2 = longLine2
        return longLine * longLine2
    }
}

class bar : foo() {
    fun print() {
        println("b: $b")
        println("c: $c")
        println("d: $d")
    }

}

fun main() {
    val foo = foo()
    foo.calculateArea(6,8)
    //foo.longLine = 5 // private olduğu için erişilemez.
    val bar = bar()
    bar.print()
    println(bar.calculateArea(3, 4))
}

