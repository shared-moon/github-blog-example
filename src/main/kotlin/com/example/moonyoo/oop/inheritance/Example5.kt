package com.example.moonyoo.oop.inheritance

class Example5 {
    open class Phone(
        protected val phoneNumber: String,
        private var prevPhoneNumber: String = "",
    ) {
        open fun call(otherPhoneNumber: String) {
            println("super send sms $otherPhoneNumber")
            prevPhoneNumber = otherPhoneNumber
        }

        open fun quickCall() {
            call(prevPhoneNumber)
        }
    }

    class SmartPhone(
        phoneNumber: String,
        private val fallbackPhoneNumber: String
    ) : Phone(phoneNumber = phoneNumber) {
        override fun quickCall() {
            call(fallbackPhoneNumber)
        }
    }

    class User {
        fun call(phone: Phone) {
            phone.call("010-1111-2222")
            phone.quickCall()
        }
    }

    fun main() {
        val phone = Phone("010-1234-5678", "game")
        val smartPhone = SmartPhone("010-1234-5678", "010-0000-0000")
        val user = User()

        user.call(phone)
        user.call(smartPhone)
    }
}

fun main() {
    Example5().main()
}