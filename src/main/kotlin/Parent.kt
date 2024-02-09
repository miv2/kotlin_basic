package main.kotlin

open class Parent(val familyName: String)

class Child(
    private val subName: String,
    familyName: String = "",
) : Parent(familyName)

class Account {

    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌이름:${field}"

    fun increaseBalance(value: Int) {
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value
    }
}

fun main() {
    val account = Account()

    account.accountName = "예금계좌"
    account.increaseBalance(100)

    println(account.accountName)
    println(account.balance)
}