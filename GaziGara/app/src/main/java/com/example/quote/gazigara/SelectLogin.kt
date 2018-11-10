package com.example.quote.gazigara

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select_login.*

class SelectLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_login)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        select_btn_login.setOnClickListener {
            val newIntent = Intent(this, Login::class.java)
            startActivity(newIntent)
        }

        select_btn_register.setOnClickListener {
            val newIntent = Intent(this, Sign::class.java)
            startActivity(newIntent)
        }
    }
}
