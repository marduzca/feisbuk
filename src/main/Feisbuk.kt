package main

class Feisbuk {

    companion object {
        var loggedInUser: String = ""
    }

    fun logIn(userName: String, password: String) {
        loggedInUser = userName
    }

    fun logOut() {
        loggedInUser = ""
    }
}