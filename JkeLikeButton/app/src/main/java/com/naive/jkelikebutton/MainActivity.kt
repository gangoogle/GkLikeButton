package com.naive.jkelikebutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_like.setOnClickListener {
            likeButton.addLike()
        }
        bt_not_like.setOnClickListener {
            likeButton.notLike()
        }
    }
}
