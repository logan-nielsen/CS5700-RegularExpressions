package org.example.regexstates.email

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState

class EmailPart1State : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "@" -> EmailAtState()
        " " -> ErrorState()
        else -> this
    }
}