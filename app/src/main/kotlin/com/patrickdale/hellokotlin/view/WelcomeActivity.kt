package com.patrickdale.hellokotlin.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.patrickdale.hellokotlin.R
import com.patrickdale.hellokotlin.presenter.WelcomePresenter

class WelcomeActivity : AppCompatActivity(), WelcomePresenter.WelcomeView {
    @BindView(R.id.hello) lateinit var welcomeMessage: TextView
    val presenter = WelcomePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        ButterKnife.bind(this)
        initializeActivity()
    }

    private fun initializeActivity(): Unit {
        presenter.init()
    }

    override fun setWelcomeMessage(value: String) {
        welcomeMessage.text = value
    }

    @OnClick(R.id.button)
    fun clickButton(): Unit {
        presenter.updateWelcomeMessage(welcomeMessage.text as String)
    }
}
