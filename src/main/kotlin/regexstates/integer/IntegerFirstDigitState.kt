package org.example.regexstates.integer

import org.example.NON_ZERO_DIGIT
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class IntegerFirstDigitState: RegexState() {
    override val isAccepting: Boolean = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in NON_ZERO_DIGIT -> IntegerValidState()
        else -> ErrorState()
    }
}