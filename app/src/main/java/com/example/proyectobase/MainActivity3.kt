package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val edNombre:EditText = findViewById(R.id.ed_nombre)
        val edApellido:EditText = findViewById(R.id.ed_apellido)
        val etdFechaNac:EditText = findViewById(R.id.etd_fechanac)
        val btnGuardar:Button = findViewById(R.id.btn_guardar)
        val txGuardado:TextView = findViewById(R.id.tx_guardado)

        btnGuardar.setOnClickListener {
            txGuardado.text = "Guardado"
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}