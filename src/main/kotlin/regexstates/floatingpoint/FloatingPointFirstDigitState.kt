package org.example.regexstates.floatingpoint

import org.example.NON_ZERO_DIGIT
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class FloatingPointFirstDigitState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in "0." -> FloatingPointDotState()
        in NON_ZERO_DIGIT -> FloatingPointAnyDigitState()
        else -> ErrorState()
    }
}