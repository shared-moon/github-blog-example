package com.example.moonyoo.oop.polymorphism

class Example4 {

    data class User(
        private val name: String,
        private val age: Int,
    )

    fun createUser(name: String, age: Int) = User(name, age)
    fun createUserWithoutName(age: Int) = User("", age)
    fun createUserWithoutAge(name: String) = User(name, 0)

    fun main() {
        createUser("name", 15)
        createUserWithoutName(15)
        createUserWithoutAge("name")
    }
}

fun main() {
    Example4().main()
}