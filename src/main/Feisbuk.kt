package main

class Feisbuk {

    companion object {
        internal var loggedInUser: String = ""
    }

    fun logIn(idName: String) {
        loggedInUser = idName
    }

    fun logOut() {
        loggedInUser = ""
    }
}