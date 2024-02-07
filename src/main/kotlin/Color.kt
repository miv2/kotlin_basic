package main.kotlin

import main.kotlin.Color.*
import java.time.Duration
import java.time.LocalDateTime

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
    printObject("OBJECT")
    printObject(Duration.ofNanos(3456))
    printObject(LocalDateTime.of(2023, 12, 12, 10, 10))
}

fun getKoreanColorName(color: Color): String = when (color) {
    RED -> "빨강 or 주황"
    ORANGE -> "주황"
    YELLOW -> "노랑"
    GREEN -> "녹색"
    BLUE -> "파랑"
}

// Unit 이 함수는 응답값이 없다. 자바에서 void와 같다.
fun printObject(obj: Any): Unit = when (obj) {
    is String -> println(obj.lowercase())
    is Duration -> println(obj.nano)
    is LocalDateTime -> println(obj.month)
    else -> println("Unknown type")
}

fun mix(c1: Color, c2: Color) =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }