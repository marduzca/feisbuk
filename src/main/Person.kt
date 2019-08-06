package main

import java.time.LocalDate

class Person(val username: String, val name: String, val country: String, val dayOfBirth: LocalDate) {
    val wall = Wall()
}