package com.patrickdale.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class KotlinActivity : AppCompatActivity() {
    @BindView(R.id.hello) lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        ButterKnife.bind(this)
        initializeActivity()
    }

    private fun initializeActivity(): Unit {
        hello.text = "hello"
    }

    @OnClick(R.id.button)
    public fun clickButton(): Unit {
        val text = hello.text == "world" ? "hello" : "world"
        hello.text = text
    }
}
