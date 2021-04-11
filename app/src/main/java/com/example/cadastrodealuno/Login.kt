package com.example.cadastrodealuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_login)

        Entrarbtn.setOnClickListener {

            val nome = NameLogin.getText().toString();
            val senha = Senhabtn.getText().toString();

            if (NameLogin.getText().length == 0 || Senhabtn.getText().length == 0 ){

                RespostaLogin.text = "Preencha Nome/Senha (Nome: Luiz Carlos | Senha: 123)"


            } else if (nome != "Luiz Carlos" || senha != "123" ){

                RespostaLogin.text = "Nome/Senha Incorreto (Nome: Luiz Carlos | Senha: 123) !"

                } else {

                val intent = Intent( this, Sobre::class.java)
                startActivity(intent)

                }
            }

        voltar.setOnClickListener {
          onBackPressed()
        }
    }
}