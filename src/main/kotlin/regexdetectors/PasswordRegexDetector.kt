package org.example.regexdetectors

import org.example.regexstates.password.PasswordNoRequirementsMetState

class PasswordRegexDetector: RegexDetector() {
    override val initialState = PasswordNoRequirementsMetState()

    override fun otherConditions(stringToParse: String): Boolean {
        return stringToParse.length >= 8
    }
}