package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btnFormulario:Button = findViewById(R.id.btn_formulario)
        val msjeBienvenida:TextView = findViewById(R.id.tx_bienvenido)
        val usuarioDesdeOtroActivity = intent.getStringExtra("sesion")

        msjeBienvenida.text = usuarioDesdeOtroActivity.toString()

        //acción boton
        btnFormulario.setOnClickListener {
            val nuevaVentana = Intent(this, MainActivity3::class.java)
            startActivity(nuevaVentana)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}