package com.example.quote.gazigara

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        get_btn_me.setOnClickListener {
            val newIntent = Intent(this, Main::class.java)
            startActivity(newIntent)
        }
    }
}
