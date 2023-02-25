package com.example.moonyoo.oop.abstration

class Example5 {
    interface Payment {
        fun pay()
    }

    interface Billable {
        fun billing()
    }

    interface Card: Payment, Billable
    class CreditCard: Card {
        override fun pay() {
            println("신용카드로 비용을 지불했습니다.")
        }

        override fun billing() {
            println("매월 26일 카드값이 청구됩니다.")
        }
    }

    class CheckCard: Card {
        override fun pay() {
            println("체크카드로 비용을 지불했습니다.")
        }

        override fun billing() {
            println("계좌로 카드값이 청구됩니다.")
        }
    }

    class Cash: Payment {
        override fun pay() {
            println("현금으로 결제했습니다.")
        }

    }

    class Pos {
        fun sell(card: Card) {
            card.pay()
            card.billing()
        }

        fun sell(payment: Payment) {
            payment.pay()
        }
    }

    fun main() {
        val pos = Pos()

        val creditCard = CreditCard()
        val checkCard = CheckCard()
        val cash = Cash()

        pos.sell(creditCard)
        pos.sell(checkCard)
        pos.sell(cash)
    }
}

fun main() {
    Example5().main()
}