package com.example.crudkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //timer
        val durationSplash = 1400
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, durationSplash.toLong())
    }

}