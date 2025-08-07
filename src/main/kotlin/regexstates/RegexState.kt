package org.example.regexstates

abstract class RegexState {
    abstract val isAccepting: Boolean
    abstract fun parseChar(nextChar: String): RegexState
}