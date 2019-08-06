package test

import main.Person
import org.junit.Test
import java.time.LocalDate

class PageTest {

    @Test
    fun shouldLikePage() {
        val testPerson = Person("userName", "John Doe", "Neverland", LocalDate.of(1994, 4, 20))

    }

}