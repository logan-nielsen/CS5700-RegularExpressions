package org.example.regexstates.password

import org.example.SPECIAL_CHARACTERS
import org.example.regexstates.RegexState

class PasswordValidState : RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in SPECIAL_CHARACTERS -> PasswordEndingSpecialCharacterState()
        else -> this
    }
}