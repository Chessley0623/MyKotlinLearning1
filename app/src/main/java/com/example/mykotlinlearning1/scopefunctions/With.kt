package com.example.mykotlinlearning1.scopefunctions

class Company2 {
    var name: String = "EIT"
    var employee: String = "David Harris"
}

fun main() {
    val employeeName: String = with(Company2()) {
        // 'founder' is returned by 'with' function
        employee
    }
    println("EIT Employee : $employeeName")
}

//Output
// EIT Employee : David Harris