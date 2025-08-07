package org.example.regexdetectors

import org.example.regexstates.RegexState

abstract class RegexDetector {
    fun parseString(stringToParse: String): Boolean {
        var currentState = initialState
        for (char in stringToParse) {
            currentState = currentState.parseChar(char.toString())
        }

        return currentState.isAccepting
    }

    abstract val initialState: RegexState
}