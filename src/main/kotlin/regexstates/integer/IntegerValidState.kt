package org.example.regexstates.integer

import org.example.DIGITS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class IntegerValidState: RegexState() {
    override val isAccepting: Boolean = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in DIGITS -> IntegerValidState()
        else -> ErrorState()
    }
}