package com.example.moonyoo.oop.abstration

class Example4 {
    interface Payment {
        fun pay()
    }
    class CreditCard: Payment {
        override fun pay() {
            println("신용카드로 비용을 지불했습니다.")
            billing()
        }

        private fun billing() {
            println("매월 26일 카드값이 청구됩니다.")
        }
    }

    class CheckCard: Payment {
        override fun pay() {
            println("체크카드로 비용을 지불했습니다.")
            billing()
        }

        private fun billing() {
            println("계좌로 카드값이 청구됩니다.")
        }
    }

    class Cash: Payment {
        override fun pay() {
            println("현금으로 결제했습니다.")
        }

    }

    class Pos {
        fun sell(card: Payment) {
            card.pay()
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
    Example4().main()
}