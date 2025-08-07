package org.example.regexstates.email

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class EmailPart2State : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "." -> EmailDotState()
        in " @" -> ErrorState()
        else -> this
    }
}