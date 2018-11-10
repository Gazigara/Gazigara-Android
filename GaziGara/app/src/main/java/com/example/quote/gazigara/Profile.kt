package com.example.quote.gazigara

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        my_btn_my.setOnClickListener {
            val col = my_btn_my.textColors
            val tocol = my_btn_request.textColors
            my_btn_request.setTextColor(col)
            my_btn_my.setTextColor(tocol)
            my_btn_my.background = getDrawable(R.drawable.circle_btn_whi)
            my_btn_request.background = getDrawable(R.drawable.circle_btn_pri)
        }

        my_btn_request.setOnClickListener {
            val col = my_btn_request.textColors
            val tocol = my_btn_my.textColors
            my_btn_request.setTextColor(tocol)
            my_btn_my.setTextColor(col)
            my_btn_my.background = getDrawable(R.drawable.circle_btn_pri)
            my_btn_request.background = getDrawable(R.drawable.circle_btn_whi)
        }

        val myAdapter = MyAdapter(this, DataService.MyModel)
        my_item_list.adapter = myAdapter
    }
}
