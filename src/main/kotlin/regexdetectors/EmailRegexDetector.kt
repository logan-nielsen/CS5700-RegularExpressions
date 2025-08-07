package org.example.regexdetectors

import org.example.regexstates.binary.BinaryFirstDigitState
import org.example.regexstates.email.EmailFirstCharacterState
import org.example.regexstates.email.EmailPart1State

class EmailRegexDetector: RegexDetector() {
    override val initialState = EmailFirstCharacterState()
}