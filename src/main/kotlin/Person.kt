package main.kotlin

class Person(val name: String, var age: Int, var isMarried: Boolean)

fun main() {
    val rectangle = Rectangle(100, 100)

    println(rectangle.isSquare)
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}