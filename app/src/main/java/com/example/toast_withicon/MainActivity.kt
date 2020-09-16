package com.example.toast_withicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            StyleableToast.makeText(applicationContext,"Hello Geek", Toast.LENGTH_LONG,R.style.mytoast).show()
        }

    }
}