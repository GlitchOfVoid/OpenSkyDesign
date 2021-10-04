package com.example.openskydes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun BackPage(view: View) {
        val BackIntent = Intent(this, MainActivity::class.java)
        startActivity(BackIntent)

    }
}