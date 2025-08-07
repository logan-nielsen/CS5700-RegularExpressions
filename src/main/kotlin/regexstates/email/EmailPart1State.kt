package org.example.regexstates.email

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.binary.BinaryValidState

class EmailPart1State : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        "@" -> EmailAmpersandState()
        " " -> ErrorState()
        else -> this
    }
}