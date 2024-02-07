package main.kotlin

fun main() {
    val students = mutableMapOf<Int, String>()

    students[1] = "Jack"
    students[2] = "Diana"
    students[3] = "Frost"

    for (student in students) {
        println("번호 : ${student.key} 이름 : ${student.value}")
    }

    println("==========================")

    for((num, name) in students) {
        println("번호 : ${num} 이름 : ${name}")
    }
    println("==========================")
    // 더 쉽게 맵을 구성하는 방법 실무에선 아래의 기법을 많이 사용
    val mapList = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost",
    )
    println(mapList) // {1=Jack, 2=Diana, 3=Frost}

    println("a는 ${recognize('a')}")
    println("9는 ${recognize('9')}")
    println("+는 ${recognize('+')}")

}

fun recognize(c: Char) = when(c) {
    in '0' .. '9' -> "숫자"
    in 'a' .. 'z', in 'A' .. 'Z' -> "알파벳"
    else -> "숫자도 문자도 아니다."
}