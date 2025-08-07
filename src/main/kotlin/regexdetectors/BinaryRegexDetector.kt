package org.example.regexdetectors

import org.example.regexstates.binary.BinaryFirstDigitState

class BinaryRegexDetector: RegexDetector() {
    override val initialState = BinaryFirstDigitState()
}