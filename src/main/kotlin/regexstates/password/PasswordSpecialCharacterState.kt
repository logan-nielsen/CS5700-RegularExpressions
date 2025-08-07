package org.example.regexstates.password

import org.example.CAPITAL_LETTERS
import org.example.regexstates.RegexState

class PasswordSpecialCharacterState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in CAPITAL_LETTERS -> PasswordValidState()
        else -> this
    }
}