package com.yawlle.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.Intent;
import com.yawlle.androiddev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        //Eventos
        binding.buttonMenu.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_menu) {
            handleSave()
        }
    }


    private fun handleSave() {
        startActivity(Intent(this, RedditActivity::class.java))

    }
}