package main.kotlin

interface Clickable {
    fun click(): Unit
}

class Button: Clickable {
    override fun click() {
        println("Button is clicked")
    }

    fun internalPrint() {

    }
}

fun main() {
    Button().click()
}