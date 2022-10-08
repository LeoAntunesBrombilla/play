package com.example.play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 0
        val textChange = findViewById<TextView>(R.id.textView)
        val addBtnClick =  findViewById<Button>(R.id.plus)
        val subBtnClick = findViewById<Button>(R.id.minus)

        addBtnClick.setOnClickListener {
            counter += 1
            textChange.text = counter.toString()
        }

        subBtnClick.setOnClickListener {
            counter -= 1
            textChange.text = counter.toString()
        }
    }
}