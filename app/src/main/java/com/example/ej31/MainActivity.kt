package com.example.ej31

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import android.widget.*



class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v1 = findViewById<EditText>(R.id.valor1)
        val v2 = findViewById<EditText>(R.id.valor2)
        val btnCalcular = findViewById<Button>(R.id.boton_calcular)
        val radioSumar = findViewById<RadioButton>(R.id.Radio_sumar)
        val radioRestar = findViewById<RadioButton>(R.id.Radio_restar)
        val resultOperacion = findViewById<TextView>(R.id.result_oper)

        btnCalcular.setOnClickListener {
            val v1_input = v1.text.toString()
            val v2_input = v2.text.toString()

            if (!TextUtils.isEmpty(v1_input) and !TextUtils.isEmpty(v2_input)){

                if (radioSumar.isChecked) {
                    val calcSuma = v1_input.toDouble() + v2_input.toDouble()
                    resultOperacion.text = calcSuma.toString()
                }
                if (radioRestar.isChecked){
                    val calcResta = v1_input.toDouble() - v2_input.toDouble()
                    resultOperacion.text = calcResta.toString()
                }
            }
        }
    }
}