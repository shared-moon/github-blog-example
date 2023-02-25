package com.example.moonyoo.oop.inheritance

class Example2 {
    open class Phone(
        protected val phoneNumber: String,
    ) {
        open fun call() {
            println("super call $phoneNumber")
        }
    }

    class SmartPhone(
        phoneNumber: String,
        private val gameTitle: String,
    ) : Phone(phoneNumber = phoneNumber) {

        override fun call() {
            println("child call $phoneNumber")
        }

        fun allCall() {
            this.call()
            super.call()
        }

        fun game() {
            println("play $gameTitle")
        }
    }

    fun main() {
        val smartPhone = SmartPhone("010-1111-2222", "game")
        smartPhone.call()
        smartPhone.allCall()
    }
}

fun main() {
    Example2().main()
}