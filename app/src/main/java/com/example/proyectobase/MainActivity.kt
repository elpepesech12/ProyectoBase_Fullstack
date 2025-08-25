package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //inicializamos variables de elementos layout
        val edUsername:EditText = findViewById(R.id.ed_username)
        val edPassword:EditText = findViewById(R.id.ed_password)
        val btnLogin:Button = findViewById(R.id.btn_login)
        val txMensaje:TextView = findViewById(R.id.tx_mensaje)

        // variables para comparar password
        var usuarioBase = "admin"
        var passwBase= "admin123"

        btnLogin.setOnClickListener {
            if(edUsername.text.toString() == usuarioBase
                && edPassword.text.toString() == passwBase){

                val nuevaVentana = Intent(this, MainActivity2::class.java)


                var ses_username = edUsername.text.toString()


                nuevaVentana.putExtra("sesion",ses_username)
                nuevaVentana.putExtra("par_contraseña", edPassword.text.toString())
                startActivity(nuevaVentana)

                val toast = Toast.makeText(this, "Bienvenid@s: "+ses_username, Toast.LENGTH_SHORT)
                toast.show()

                txMensaje.text = "Login OK"
            }else{
                txMensaje.text = "Login NO"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}