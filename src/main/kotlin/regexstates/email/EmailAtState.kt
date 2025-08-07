package org.example.regexstates.email

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class EmailAtState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in " @." -> ErrorState()
        else -> EmailPart2State()
    }
}