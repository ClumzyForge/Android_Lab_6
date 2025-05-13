package com.clumzyforge.android_lab_5

import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged
import org.w3c.dom.Text
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.button).setOnClickListener(View.OnClickListener {

            var waga: String = findViewById<EditText>(R.id.waga).text.toString()
            var wzrost: String = findViewById<EditText>(R.id.wzrost).text.toString()

            var bmi: Double = waga.toDouble() / Math.pow(wzrost.toDouble() / 100, 2.0)

            findViewById<TextView>(R.id.bmi).setText("${bmi.toInt()}")

        })

    }
}