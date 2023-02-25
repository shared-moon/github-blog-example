package com.example.moonyoo.oop.polymorphism

class Example2 {

    interface A {
        fun print()
    }

    class B : A {
        override fun print() {
            println("I'm B!!")
        }
    }

    class C : A {
        override fun print() {
            printC()
        }

        fun printC() {
            println("I'm C!!")
        }
    }

    fun print(a: A) {
        val c: C = a as C
        c.printC()
    }

    fun main() {
        print(C())
        print(B())
    }
}

fun main() {
    Example2().main()
}