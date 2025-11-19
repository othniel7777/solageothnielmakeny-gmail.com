package com.example.lab2

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.Question).setOnClickListener {
            findViewById<View>(R.id.Question).visibility= View.INVISIBLE
            findViewById<View>(R.id.Reponse).visibility= View.VISIBLE
        }

        findViewById<View>(R.id.Reponse).setOnClickListener {
            findViewById<View>(R.id.Reponse).visibility = View.INVISIBLE
            findViewById<View>(R.id.Question).visibility = View.VISIBLE
        }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}