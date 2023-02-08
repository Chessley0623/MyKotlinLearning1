package com.example.mykotlinlearning1.scopefunctions

class Company() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var employee: String
}

fun main() {
    Company().apply {
        // same as founder = “David Harris”
        this.employee = "David Harris"
        name = "EIT"
        objective = "A computer science company"
    }
}