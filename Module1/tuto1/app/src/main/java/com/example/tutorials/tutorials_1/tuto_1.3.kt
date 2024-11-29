package com.example.greetingcard

fun main() {

    fun test(name : String) : String{
        return "hello $name"
    }
    val result = test(name = "Samia")
    println(result)
}

