package main

import java.time.LocalDate

abstract class FbObject(val idName: String, val name: String) {
    val wall: Wall = Wall()
}