package com.example.openskydes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun TestsMy(view: View) {
        val TestsIntent = Intent(this, Second_activity::class.java)
        startActivity(TestsIntent)
    }

    fun CalendarPage(view: View) {
        val CalendarIntent = Intent(this, MainActivity2::class.java)
        startActivity(CalendarIntent)

    }

}