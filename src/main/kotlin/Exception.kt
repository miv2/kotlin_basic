package main.kotlin

import java.io.IOException
import java.lang.Exception

fun functionName() {

    /***
     * 코틀린 + 스프링에서 @Transactional 활용할때 주의사항
     * CheckedException은 롤백이 되지 않는다.
     * 컴파일러가 알려주지 않기 떄문에 문제를 모르고 넘어갈 수 있다.
     * 예외가 나왔지만 롤백되지 않고 진행이 된다.
     * 해당 예외가 발생할만한 포인트는 try catch를 걸어주는 편이 좋다.
     * 가급적이면 CheckedException은 사용 하지말자
     */
    try {
        Integer.parseInt("123")
        throw IOException("Checked Exception")
    } catch (e: Exception) {
        throw RuntimeException("UnChecked Exception")
    } finally {
        println("무조건 실행")
    }
}