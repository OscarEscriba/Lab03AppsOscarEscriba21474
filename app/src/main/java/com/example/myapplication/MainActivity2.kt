package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var txt1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txt1=findViewById(R.id.textView12)
        val textoRecibido =intent.getStringExtra("Texto")
        txt1.text=textoRecibido
    }
}