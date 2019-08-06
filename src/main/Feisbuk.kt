package main

class Feisbuk {
    private val users: ArrayList<Person> = ArrayList()

    companion object {
        var loggedInUser: Person? = null
    }

    fun logIn(idName: String) {
        loggedInUser = users.find { it.idName == idName }
    }

    fun logOut() {
        loggedInUser = null
    }

}