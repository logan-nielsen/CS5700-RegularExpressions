package org.example.regexstates.binary

import org.example.NON_ZERO_DIGIT
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.floatingpoint.FloatingPointAnyDigitState
import org.example.regexstates.floatingpoint.FloatingPointDotState

class BinaryEndZeroState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "0" -> this
        "1" -> BinaryValidState()
        else -> ErrorState()
    }
}