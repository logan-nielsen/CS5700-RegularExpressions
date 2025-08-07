package org.example.regexstates.password

import org.example.CAPITAL_LETTERS
import org.example.SPECIAL_CHARACTERS
import org.example.regexstates.ErrorState
import org.example.regexstates.RegexState
import org.example.regexstates.binary.BinaryValidState

class PasswordCapitalLetterState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in SPECIAL_CHARACTERS -> PasswordSpecialCharacterState()
        else -> this
    }
}