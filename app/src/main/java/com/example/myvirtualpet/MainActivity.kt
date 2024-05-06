package com.example.myvirtualpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val imageViewDog = findViewById<ImageView>(R.id.imageViewDog)
        val imageViewCat = findViewById<ImageView>(R.id.imageViewCat)
        val imageViewGriffin = findViewById<ImageView>(R.id.imageViewGriffin)

        val dogButton = findViewById<Button>(R.id.dogButton)
        val catButton = findViewById<Button>(R.id.catbutton)
        val griffinButton = findViewById<Button>(R.id.griffinButton)

            dogButton.setOnClickListener {

            catButton.setOnClickListener {
            griffinButton.setOnClickListener {
            }
            }
            }

    }
}

