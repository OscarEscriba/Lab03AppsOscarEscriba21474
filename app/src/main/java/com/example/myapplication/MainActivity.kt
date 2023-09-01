package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    //Declaracion de las variables que nos van a servir para instantear las imagenes.
    var ImageView1:ImageView?=null
    var ImageView2: ImageView?=null
    var ImageView3: ImageView?=null
    var ImageView4: ImageView?=null
    var ImageView5: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inicializar cada imagen como un conector hacia los otros activities
        /** ImageView1 = findViewById(R.id.imageView12)
        ImageView2 = findViewById(R.id.imageView13)
        ImageView3 = findViewById(R.id.imageView14)
        ImageView4 = findViewById(R.id.imageView15)
        ImageView5 = findViewById(R.id.imageView16)
        */
        //actividad de los botones...
        val botonNavidad: ImageView = findViewById(R.id.imageView16)
        botonNavidad.setOnClickListener{
            openLayoutNavidad()
        }
        val botonAnionuevo: ImageView = findViewById(R.id.imageView15)
        botonAnionuevo.setOnClickListener {
            openLayoutAnioNuevo()
        }
        val botonGraduacion: ImageView = findViewById(R.id.imageView14)
        botonGraduacion.setOnClickListener {
            openLayoutGraduacion()
        }
        val botonBoda: ImageView = findViewById(R.id.imageView13)
        botonBoda.setOnClickListener {
            openLayoutBoda()
        }
        val botonQuince: ImageView = findViewById(R.id.imageView12)
        botonQuince.setOnClickListener {
            openLayoutQuince()
        }
    }
    //las funciones para abrir la nueva activity...
    private fun openLayoutNavidad() {
        val intent = Intent(this,MainActivity2:: class.java)
        startActivity(intent)
    }
    private fun openLayoutAnioNuevo() {
        val intent = Intent(this,anionuevo:: class.java)
        startActivity(intent)
    }
    private fun openLayoutGraduacion() {
        val intent = Intent(this,graduacion:: class.java)
        startActivity(intent)
    }
    private fun openLayoutBoda() {
        val intent = Intent(this,boda:: class.java)
        startActivity(intent)
    }
    private fun openLayoutQuince() {
        val intent = Intent(this,quinceanios:: class.java)
        startActivity(intent)
    }

}