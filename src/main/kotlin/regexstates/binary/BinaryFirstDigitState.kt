package org.example.regexstates.binary

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class BinaryFirstDigitState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "1" -> BinaryValidState()
        else -> ErrorState()
    }
}