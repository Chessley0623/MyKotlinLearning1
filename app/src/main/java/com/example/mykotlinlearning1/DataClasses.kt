package com.example.mykotlinlearning1

data class Book(val name: String, val authorName: String = "Anupam", val lastModified: Long = 1234567, val rating: Float = 5f, val downloads: Int = 1000)

fun main() {

    val book = Book("Android tutorials","Anupam", 1234567, 4.5f, 1000)
    println(book)

    val newBook = book.copy(name = "Kotlin")
    println(newBook)
}

//Following is printed in the console.
//Book(name=Android tutorials, authorName=Anupam, lastModified=1234567, rating=4.5, downloads=1000)
//Book(name=Kotlin, authorName=Anupam, lastModified=1234567, rating=4.5, downloads=1000)