import org.example.regexdetectors.BinaryRegexDetector
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class BinaryRegexDetectorTest {
    private val detector = BinaryRegexDetector()

    @Test
    fun testBinaryPatterns() {
        assertTrue(detector.parseString("1"))
        assertTrue(detector.parseString("11"))
        assertTrue(detector.parseString("10110000011111001"))

        assertFalse(detector.parseString(""))
        assertFalse(detector.parseString("0"))
        assertFalse(detector.parseString("00"))
        assertFalse(detector.parseString("2"))
        assertFalse(detector.parseString("12"))
        assertFalse(detector.parseString("a"))
    }
}