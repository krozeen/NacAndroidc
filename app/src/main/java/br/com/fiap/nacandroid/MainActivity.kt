package br.com.fiap.nacandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCadastrar.setOnClickListener {
            cadastrarUsuario()
        }
    }

    private fun cadastrarUsuario() {

        val nome = edNome.text
        val time = spTime.selectedItem.toString()

        val intent = Intent(this@MainActivity,
                ConfirmacaoActivity::class.java
        )
        intent.putExtra("NOME", nome.toString())
        intent.putExtra("TIME", time)

        startActivity(intent)

    }
}
