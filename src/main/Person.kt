package main

import java.time.LocalDate

class Person(idName: String, name: String, val country: String, val dayOfBirth: LocalDate): FeisbukObject(idName, name) {
    val pagesLiked: ArrayList<Page> = ArrayList()
}