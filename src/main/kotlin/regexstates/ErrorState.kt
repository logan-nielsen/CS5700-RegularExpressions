package org.example.regexstates

class ErrorState: RegexState() {
    override val isAccepting: Boolean = false
    override fun parseChar(nextChar: String): RegexState = this
}