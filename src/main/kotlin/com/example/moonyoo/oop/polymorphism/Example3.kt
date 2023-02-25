package com.example.moonyoo.oop.polymorphism

class Example3 {

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
        if (a is C) {
            a.printC()
            return
        }
        a.print()
    }

    fun main() {
        print(C())
        print(B())
    }
}

fun main() {
    Example3().main()
}