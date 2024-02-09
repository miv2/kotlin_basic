package main.kotlin

class User (val userName : String,
            val age: Int = 28)

fun main() {
    println(User("김태수", 21).age)
}