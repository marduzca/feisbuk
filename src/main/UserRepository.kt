package main

private val users: ArrayList<Person> = ArrayList()

fun getUserById(id: String): Person? {
    return users.find { it.idName == id }
}