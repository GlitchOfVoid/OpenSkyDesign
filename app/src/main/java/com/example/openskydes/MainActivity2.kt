package com.example.openskydes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View




class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun BackPage2(view: View) {
        val BackIntent2 = Intent(this, MainActivity::class.java)
        startActivity(BackIntent2)

    }
}