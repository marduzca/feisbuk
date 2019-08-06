package main

import java.time.LocalDate

abstract class FeisbukObject(val idName: String, val name: String) {
    val wall: Wall = Wall()
}