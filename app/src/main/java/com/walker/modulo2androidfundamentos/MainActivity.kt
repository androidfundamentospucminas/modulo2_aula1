package com.walker.modulo2androidfundamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.walker.calculadoralib.Calculadora

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultadoTextView = findViewById<TextView>(R.id.resultado)
        resultadoTextView.text = Calculadora.multiplica(10, 20).toString()
    }
}