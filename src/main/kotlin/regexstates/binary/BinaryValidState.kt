package org.example.regexstates.binary

import org.example.NON_ZERO_DIGIT
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.floatingpoint.FloatingPointAnyDigitState
import org.example.regexstates.floatingpoint.FloatingPointDotState

class BinaryValidState : RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "0" -> BinaryEndZeroState()
        "1" -> this
        else -> ErrorState()
    }
}