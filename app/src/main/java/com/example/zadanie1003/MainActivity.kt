package com.example.zadanie1003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers = findViewById<EditText>(R.id.phone).text
        var num = Integer.parseInt(numbers.toString())
        findViewById<Button>(R.id.zatwierdz).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = numbers.toString()
            var binaryN = 0
            var count = 0
            while (num != 0) {
                val rem = num% 2
                val c = 10.toDouble().pow(count)
                binaryN += (rem * c).toInt()

                num = num / 2
                count++
                findViewById<TextView>(R.id.binarny).text = binaryN.toString()
            }

        }

    }
}