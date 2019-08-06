package main

private var idCounter: Int = 0

fun generatePostId(): Int {
    return idCounter++
}