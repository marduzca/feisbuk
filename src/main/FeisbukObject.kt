package main

abstract class FeisbukObject(val idName: String, val name: String) {
    val wall: Wall = Wall()
}