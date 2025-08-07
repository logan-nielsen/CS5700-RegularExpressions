package org.example.regexdetectors

import org.example.regexstates.binary.BinaryFirstDigitState
import org.example.regexstates.floatingpoint.FloatingPointFirstDigitState

class BinaryRegexDetector: RegexDetector() {
    override val initialState = BinaryFirstDigitState()
}