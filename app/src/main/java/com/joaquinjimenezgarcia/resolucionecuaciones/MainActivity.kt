package com.joaquinjimenezgarcia.resolucionecuaciones

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var button: Button? = null
    private var valor1: EditText? = null
    private var valor2: EditText? = null
    private var valor3: EditText? = null
    private var textX1: TextView? = null
    private var textX2: TextView? = null

    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    var x1: Double = 0.0
    var x2: Double = 0.0
    var valorX1: String = ""
    var valorX2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button) as Button

        button!!.setOnClickListener { cuenta() }
    }

    fun cuenta() {
        valor1 = findViewById(R.id.valor1) as EditText
        valor2 = findViewById(R.id.valor2) as EditText
        valor3 = findViewById(R.id.valor3) as EditText
        textX1 = findViewById(R.id.textX1) as TextView
        textX2 = findViewById(R.id.textX2) as TextView

        a = java.lang.Double.parseDouble(valor1!!.text.toString())
        b = java.lang.Double.parseDouble(valor2!!.text.toString())
        c = java.lang.Double.parseDouble(valor3!!.text.toString())

        x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / 2 * a
        x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / 2 * a

        valorX1 = x1.toString()
        valorX2 = x2.toString()

        textX1!!.text = valorX1
        textX2!!.text = valorX2
    }
}
