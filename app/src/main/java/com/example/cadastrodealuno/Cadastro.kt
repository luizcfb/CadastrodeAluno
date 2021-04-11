package com.example.cadastrodealuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.*

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_cadastro)

        voltar2.setOnClickListener {
            onBackPressed()
        }

        cadastar2.setOnClickListener {

            if (nome.getText().length == 0 || endereço.getText().length == 0
                || numero.getText().length == 0 || complemento.getText().length == 0 ){

                mensagem.text = "Preencha Todos Os Campos"


            } else {

                mensagem.text = "Cadastro Realizado Com Sucesso !"

            }
        }
    }
}