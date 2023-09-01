package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class anionuevo : AppCompatActivity() {
    private lateinit var txt1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anionuevo)
        txt1=findViewById(R.id.textView9)
        val textoRecibido =intent.getStringExtra("Texto")
        txt1.text=textoRecibido
    }
}