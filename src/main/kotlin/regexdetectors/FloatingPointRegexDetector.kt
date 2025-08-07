package org.example.regexdetectors

import org.example.regexstates.floatingpoint.FloatingPointFirstDigitState

class FloatingPointRegexDetector: RegexDetector() {
    override val initialState = FloatingPointFirstDigitState()
}