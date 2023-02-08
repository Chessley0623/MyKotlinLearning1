package com.example.mykotlinlearning1

sealed class Demo {
    object A : Demo() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    object B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

fun main() {
    val obj =Demo.B
    obj.display()
    val obj1=Demo.A
    obj1.display()
}

//Output
//Subclass B of sealed class Demo
//Subclass A of sealed class Demo