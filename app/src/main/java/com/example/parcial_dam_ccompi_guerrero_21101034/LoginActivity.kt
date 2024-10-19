package com.example.parcial_dam_ccompi_guerrero_21101034

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        title = "Sign In"

        val emailSucess: String = "admin@travelapp.com"
        val passwordSucess: String = "admin123"

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnSignin = findViewById<Button>(R.id.btnSignin)

        btnSignin.setOnClickListener {
            val email : String = etEmail.text.trim().toString()
            val password : String = etPassword.text.trim().toString()

            if (email == emailSucess && password == passwordSucess){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                val rootView: View = findViewById(android.R.id.content)
                Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_LONG).show()

            }

        }



    }
}