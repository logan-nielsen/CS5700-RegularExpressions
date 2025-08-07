package org.example.regexstates.floatingpoint

import org.example.DIGITS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class FloatingPointDotState: RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in DIGITS -> FloatingPointValidState()
        else -> ErrorState()
    }
}