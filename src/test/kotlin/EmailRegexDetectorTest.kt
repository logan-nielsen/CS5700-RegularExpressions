import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.example.regexdetectors.EmailRegexDetector

class EmailRegexDetectorTest {
    private val detector = EmailRegexDetector()

    @Test
    fun testEmailRegexDetector() {
        assertTrue(detector.parseString("test@example.com"))
        assertTrue(detector.parseString("user@domain.co"))
        assertTrue(detector.parseString("name@subdomain.com"))

        assertFalse(detector.parseString("test@.com"))
        assertFalse(detector.parseString("@domain.com"))
        assertFalse(detector.parseString("test@domain"))
        assertFalse(detector.parseString("test.domain.com"))
        assertFalse(detector.parseString("test@domain@com"))
        assertFalse(detector.parseString("test space@domain.com"))
        assertFalse(detector.parseString("name@subdomain.domain.com"))
    }
}