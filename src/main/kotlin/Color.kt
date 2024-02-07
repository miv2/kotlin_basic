package main.kotlin

import main.kotlin.Color.*

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
    val mix = mix(YELLOW, BLUE)
    println(mix)
}

fun getKoreanColorName(color: Color): String = when (color) {
    RED -> "빨강 or 주황"
    ORANGE -> "주황"
    YELLOW -> "노랑"
    GREEN -> "녹색"
    BLUE -> "파랑"
}

fun mix(c1: Color, c2: Color) =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }