package com.example.moonyoo.oop.polymorphism

class Example1 {

    open class A {
        fun print() {
            println("I'm A!!")
        }
    }

    class B : A()

    fun main() {
        val a: A = B()
        a.print()
    }
}

fun main() {
    Example1().main()
}