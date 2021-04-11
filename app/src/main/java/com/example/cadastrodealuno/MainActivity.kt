package com.example.cadastrodealuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val intent = Intent( this, Login::class.java)
            startActivity(intent)
        }

        cadastrobtn.setOnClickListener {
            val intent = Intent( this, Cadastro::class.java)
            startActivity(intent)
        }

        sobrebtn.setOnClickListener {
            val intent = Intent( this, Sobre::class.java)
            startActivity(intent)
        }

    }
}