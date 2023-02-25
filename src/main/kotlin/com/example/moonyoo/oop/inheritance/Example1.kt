package com.example.moonyoo.oop.inheritance

class Example1 {
    open class Phone(
        private val phoneNumber: String,
    ) {
        fun call() {
            println("call $phoneNumber")
        }
    }

    class SmartPhone(
        phoneNumber: String,
        private val gameTitle: String,
    ) : Phone(phoneNumber = phoneNumber) {
        fun game() {
            println("play $gameTitle")
        }
    }

    fun main() {
        val phone = Phone("010-1234-5678")

        phone.call()
//    phone.game()

        val smartPhone = SmartPhone("010-1234-5678", "game")

        smartPhone.call()
        smartPhone.game()
    }
}

fun main() {
    Example1().main()
}