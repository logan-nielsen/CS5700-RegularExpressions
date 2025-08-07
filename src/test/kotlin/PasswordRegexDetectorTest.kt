import org.example.regexdetectors.PasswordRegexDetector
import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.Test
import kotlin.test.assertTrue

class PasswordRegexDetectorTest {
    @Test
    fun testPasswordRegexDetector() {
        val detector = PasswordRegexDetector()

        assertTrue(detector.parseString("aaaaH!aa"))
        assertTrue(detector.parseString("1234567*9J@@aA"))
        assertTrue(detector.parseString("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))

        assertFalse(detector.parseString("a"))
        assertFalse(detector.parseString("aaaaaaa!"))
        assertFalse(detector.parseString("aaaHaaaaa"))
        assertFalse(detector.parseString("Abbbbbbb!"))
        assertFalse(detector.parseString("Abbb&bbb!"))
        assertFalse(detector.parseString("A&1"))
    }
}