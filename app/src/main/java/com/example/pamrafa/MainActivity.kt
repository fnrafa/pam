package com.example.pamrafa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val operationGroup = findViewById<RadioGroup>(R.id.operationGroup)
        val calculateButton = findViewById<Button>(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = secondNumber.text.toString().toDoubleOrNull() ?: 0.0
            var result = 0.0

            when (operationGroup.checkedRadioButtonId) {
                R.id.addition -> result = num1 + num2
                R.id.subtraction -> result = num1 - num2
                R.id.multiplication -> result = num1 * num2
                R.id.division -> if (num2 != 0.0) result = num1 / num2
            }

            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("RESULT", result)
            }
            startActivity(intent)
        }
    }
}
