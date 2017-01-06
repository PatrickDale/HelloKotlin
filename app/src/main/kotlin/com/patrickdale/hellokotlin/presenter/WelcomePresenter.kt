package com.patrickdale.hellokotlin.presenter

/**
 * Created by patdale on 1/6/17.
 */

class WelcomePresenter(val view: WelcomeView) {
    fun init() {
        view.setWelcomeMessage("hello")
    }

    fun updateWelcomeMessage(currentValue: String) {
        val message = when(currentValue) {
            "hello" -> "world"
            else -> "hello"
        }
        view.setWelcomeMessage(message)
    }

    interface WelcomeView {
        fun setWelcomeMessage(value: String)
    }
}
