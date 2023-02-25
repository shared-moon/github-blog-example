package com.example.moonyoo.oop.polymorphism

class Example5 {

    data class User(
        private val name: String,
        private val age: Int,
    )

    fun createUser(name: String, age: Int) = User(name, age)
    fun createUser(age: Int) = createUser("", age)
    fun createUser(name: String) = createUser(name, 0)

    fun main() {
        createUser("name", 15)
        createUser(15)
        createUser("name")
    }
}

fun main() {
    Example5().main()
}