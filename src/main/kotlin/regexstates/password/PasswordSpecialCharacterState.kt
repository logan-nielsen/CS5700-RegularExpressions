package org.example.regexstates.password

import org.example.CAPITAL_LETTERS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.binary.BinaryValidState

class PasswordSpecialCharacterState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in CAPITAL_LETTERS -> PasswordValidState()
        else -> this
    }
}