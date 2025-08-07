package org.example.regexstates.password

import org.example.SPECIAL_CHARACTERS
import org.example.regexstates.RegexState

class PasswordEndingSpecialCharacterState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in SPECIAL_CHARACTERS -> this
        else -> PasswordValidState()
    }
}