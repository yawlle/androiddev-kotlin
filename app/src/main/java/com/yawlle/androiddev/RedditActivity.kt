package com.yawlle.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RedditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reddit)

        supportActionBar?.hide()



    }
}