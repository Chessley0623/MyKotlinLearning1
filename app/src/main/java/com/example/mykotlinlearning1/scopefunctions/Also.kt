package com.example.mykotlinlearning1.scopefunctions

fun main() {
    // initialized
    val list = mutableListOf(1, 2, 3)

    // later if we want to perform
    // multiple operations on this list
    list.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
    println(list)
}

//Output
//[1, 3, 4]