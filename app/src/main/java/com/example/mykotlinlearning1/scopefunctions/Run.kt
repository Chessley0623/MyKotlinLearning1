package com.example.mykotlinlearning1.scopefunctions

class Company1() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var employee: String
}

fun main() {
    println("Company Name : ")
    var company1: Company1? = null
    // body only executes if
    // company is non-null
    company1?.run {
        print(name)
    }
    print("Company Name : ")
    // re-initialize company
    company1 = Company1().apply {
        name = "EIT"
        employee = "David Harris"
        objective = "A computer science company"
    }
    // body executes as
    // 'company' is non-null
    company1?.run {
        print(name)
    }
}