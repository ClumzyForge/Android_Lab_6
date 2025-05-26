package com.clumzyforge.android_lab_5

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Timer
import kotlin.concurrent.timerTask

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("SplashScreen created")
        Toast.makeText(applicationContext, "SplashScreen created", Toast.LENGTH_SHORT).show()

        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(timerTask {

            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }

    override fun onStart() {
        super.onStart()
        println("SplashScreen started")
        Toast.makeText(applicationContext, "SplashScreen started", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        println("SplashScreen destroyed")
        Toast.makeText(applicationContext, "SplashScreen destroyed", Toast.LENGTH_SHORT).show()
    }
}