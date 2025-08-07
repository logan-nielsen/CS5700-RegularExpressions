package org.example.regexstates.binary

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class BinaryValidState : RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "0" -> BinaryEndZeroState()
        "1" -> this
        else -> ErrorState()
    }
}