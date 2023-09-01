package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class graduacion : AppCompatActivity() {
    private lateinit var txt1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduacion)
        txt1=findViewById(R.id.textView6)
        val textoRecibido =intent.getStringExtra("Texto")
        txt1.text=textoRecibido
    }
}