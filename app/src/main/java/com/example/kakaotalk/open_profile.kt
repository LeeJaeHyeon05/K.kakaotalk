package com.example.kakaotalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class open_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_profile)

        val cancelButton = findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            onBackPressed()

        }
    }
}