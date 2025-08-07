import org.example.regexdetectors.FloatingPointRegexDetector
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FloatingPointRegexDetectorTest {

    @Test
    fun testFloatingPointDetector() {
        val detector = FloatingPointRegexDetector()

        // Valid floating point numbers
//        assertTrue { detector.parseString("123.45") }
        assertTrue { detector.parseString("0.20000") }
        assertTrue { detector.parseString("12349871234.12340981234098") }
        assertTrue { detector.parseString(".123") }
        assertTrue { detector.parseString("123.34") }

        // Invalid inputs
        assertFalse { detector.parseString("123") }
        assertFalse { detector.parseString("123.") }
        assertFalse { detector.parseString("") }
        assertFalse { detector.parseString("abc") }
        assertFalse { detector.parseString("-123.45") }
        assertFalse { detector.parseString("01.45") }
    }
}