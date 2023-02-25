package com.example.moonyoo.oop.inheritance

class Example4 {
    open class Phone(
        protected val phoneNumber: String,
    ) {
        open fun call(otherPhoneNumber: String) {
            println("super send sms $otherPhoneNumber")
        }
    }

    class SmartPhone(
        phoneNumber: String,
        private val gameTitle: String,
    ) : Phone(phoneNumber = phoneNumber) {
        // ...
    }

    class User {
        fun call(phone: SmartPhone) {
//            phone.call()
        }
    }

    fun main() {
        val smartPhone = SmartPhone("010-1234-5678", "game")
        User().call(smartPhone)
    }
}

fun main() {
    Example4().main()
}