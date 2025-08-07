package org.example.regexstates.password

import org.example.CAPITAL_LETTERS
import org.example.SPECIAL_CHARACTERS
import org.example.regexstates.RegexState

class PasswordNoRequirementsMetState : RegexState() {
    override val isAccepting = false

    override fun parseChar(nextChar: String): RegexState = when (nextChar) {
        in CAPITAL_LETTERS -> PasswordCapitalLetterState()
        in SPECIAL_CHARACTERS -> PasswordSpecialCharacterState()
        else -> this
    }
}