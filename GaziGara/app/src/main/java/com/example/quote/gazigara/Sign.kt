package com.example.quote.gazigara

import android.content.Context
import android.content.pm.ActivityInfo
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sign.*

class Sign : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        sign_btn_next.setOnClickListener {
            first_panel.visibility = View.INVISIBLE
            second_panel.visibility = View. VISIBLE
        }

        sign_btn_back.setOnClickListener {
            second_panel.visibility = View.INVISIBLE
            first_panel.visibility = View.VISIBLE
        }

    }
}
