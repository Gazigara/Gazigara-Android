package com.example.quote.gazigara

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.drawable.Drawable
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_item_view.view.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        val mainAdapter = MainAdapter(this, DataService.MainModel)
        test_list.adapter = mainAdapter

        main_btn_profile.setOnClickListener {
            val newIntent = Intent(this, Profile::class.java)
            startActivity(newIntent)
        }

        main_btn_add.setOnClickListener {
            val newIntent = Intent(this, Add::class.java)
            startActivity(newIntent)
        }
    }
}
