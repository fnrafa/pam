package com.example.pamrafa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText = findViewById<TextView>(R.id.resultText)

        val result = intent.getDoubleExtra("RESULT", 0.0)


        resultText.text = buildString {
            append("Hasil: ")
            append(result)
        }
    }
}
