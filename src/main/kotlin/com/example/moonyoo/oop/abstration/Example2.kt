package com.example.moonyoo.oop.abstration

import com.sun.tools.javac.comp.Check

class Example2 {
    class CreditCard {
        fun pay() {
            println("신용카드로 비용을 지불했습니다.")
        }

        fun billing() {
            println("매월 26일 카드값이 청구됩니다.")
        }
    }

    class CheckCard {
        fun pay() {
            println("체크카드로 비용을 지불했습니다.")
        }

        fun billing() {
            println("계좌로 카드값이 청구됩니다.")
        }
    }

    class Pos {
        fun sell(creditCard: CreditCard) {
            creditCard.pay()
            creditCard.billing()
        }

        fun sell(checkCard: CheckCard) {
            checkCard.pay()
            checkCard.billing()
        }
    }

    fun main() {
        val pos = Pos()

        val checkCard = CheckCard()

        pos.sell(checkCard)
    }
}

fun main() {
    Example2().main()
}