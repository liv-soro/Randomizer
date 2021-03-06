package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

//activity is like backend, views is like front end

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//where layout gets connected to activity, makes activity_main.xml the layout

        /*Creating a variable in Kotlin
        * val: stuff that doesn't change
        * var: can change*/
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress)//to generate random number between 0 and value of our seekBar
            resultsTextView.text = rand.toString()
        }
    }
}