package com.example.mykotlinlearning1.scopefunctions

fun main() {
    // nullable variable a
    // with value as null
    var a: Int? = null
    // using let function
    a?.let {
        // statement(s) will
        // not execute as a is null
        print(it)
    }
    // re-initializing value of a to 2
    a = 2
    a?.let {
        // statement(s) will execute
        // as a is not null
        print(a)
    }
}

//Output
// 2