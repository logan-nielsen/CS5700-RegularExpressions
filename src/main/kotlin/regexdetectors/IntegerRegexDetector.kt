package org.example.regexdetectors

import org.example.regexstates.integer.IntegerFirstDigitState

class IntegerRegexDetector() : RegexDetector() {
    override val initialState = IntegerFirstDigitState()
}