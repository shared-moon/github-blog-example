package com.example.moonyoo.oop.abstration

class Example3 {
    interface Card {
        fun pay()
        fun billing()
    }
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

    class Pos {
        fun sell(card: Card) {
            card.pay()
            card.billing()
        }
    }

    fun main() {
        val pos = Pos()

        val creditCard = CreditCard()
        val checkCard = CheckCard()

        pos.sell(creditCard)
        pos.sell(checkCard)
    }
}

fun main() {
    Example3().main()
}