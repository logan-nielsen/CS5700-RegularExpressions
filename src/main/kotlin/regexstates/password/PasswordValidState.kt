package org.example.regexstates.password

import org.example.SPECIAL_CHARACTERS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.binary.BinaryValidState

class PasswordValidState : RegexState() {
    override val isAccepting = true

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in SPECIAL_CHARACTERS -> PasswordEndingSpecialCharacterState()
        else -> this
    }
}