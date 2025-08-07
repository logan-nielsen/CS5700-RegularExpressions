package org.example.regexdetectors

import org.example.regexstates.email.EmailFirstCharacterState

class EmailRegexDetector: RegexDetector() {
    override val initialState = EmailFirstCharacterState()
}