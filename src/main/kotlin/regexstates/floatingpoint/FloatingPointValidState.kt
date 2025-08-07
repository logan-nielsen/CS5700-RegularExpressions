package org.example.regexstates.floatingpoint

import org.example.DIGITS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class FloatingPointValidState: RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in DIGITS -> this
        else -> ErrorState()
    }
}