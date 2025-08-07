package org.example.regexstates.email

import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.binary.BinaryValidState

class EmailPart3State : RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in " @." -> ErrorState()
        else -> this
    }
}