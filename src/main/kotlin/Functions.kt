package main.kotlin

fun getMyName(
    firstName: String = "Jung",
    lastName: String
): String = "${firstName}, ${lastName}"

fun main() {
    println(getMyName("TaeSu", "Kim"))
    println(getMyName(lastName = "Kim", firstName = "TaeSu"))
    println(getMyName(lastName = "TaeSu"))
}