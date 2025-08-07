import org.example.regexdetectors.FloatingPointRegexDetector
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FloatingPointRegexDetectorTest {

    @Test
    fun testFloatingPointDetector() {
        val detector = FloatingPointRegexDetector()

        // Valid floating point numbers
        assertTrue { detector.parseString("123.45") }
        assertTrue { detector.parseString("1.0") }
        assertTrue { detector.parseString("99.999") }
        assertTrue { detector.parseString(".123") }

        // Invalid inputs
        assertFalse { detector.parseString("123") }
        assertFalse { detector.parseString("123.") }
        assertFalse { detector.parseString("") }
        assertFalse { detector.parseString("abc") }
        assertFalse { detector.parseString("-123.45") }
        assertFalse { detector.parseString("00.45") }
    }
}