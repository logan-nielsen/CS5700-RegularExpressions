import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.example.regexdetectors.IntegerRegexDetector

class IntegerRegexDetector {
    @Test
    fun testIntegerDetector() {
        val detector = IntegerRegexDetector()

        // Valid integers
        assertTrue { detector.parseString("123") }
        assertTrue { detector.parseString("9999") }
        assertTrue { detector.parseString("1") }

        // Invalid inputs
        assertFalse { detector.parseString("0") }
        assertFalse { detector.parseString("01") }
        assertFalse { detector.parseString("") }
        assertFalse { detector.parseString("abc") }
        assertFalse { detector.parseString("4abc") }
        assertFalse { detector.parseString("-123") }
    }
}