package test

import main.Feisbuk
import org.junit.Test
import kotlin.test.assertEquals


internal class FeisbukTest {

    private val feisbuk = Feisbuk()

    @Test
    fun shouldLogInUser() {
        feisbuk.logIn("testUser")

        assertEquals("testUser", Feisbuk.loggedInUser)
    }

    @Test
    fun shouldLogOutUser() {
        feisbuk.logOut()

        assertEquals("", Feisbuk.loggedInUser)
    }
}