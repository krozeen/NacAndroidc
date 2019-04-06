package br.com.fiap.nacandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confirmacao.*

class ConfirmacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao)

        carregarMensagem()
    }

    private fun carregarMensagem() {
        val nome = intent.getStringExtra("NOME")
        val time = intent.getStringExtra("TIME")

        tvMensagem.text = nome + " torcedor do " + time + "obrigado por responder a enquete!!!"
    }
}
