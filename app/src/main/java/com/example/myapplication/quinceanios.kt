package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class quinceanios : AppCompatActivity() {
    private lateinit var txt1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinceanios)
        txt1=findViewById(R.id.textView15)
        val textoRecibido =intent.getStringExtra("Texto")
        txt1.text=textoRecibido

    }
}