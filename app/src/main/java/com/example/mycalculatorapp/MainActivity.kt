package com.example.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var etnum1: EditText? = null
    var etnum2: EditText? = null
    var btnadd: Button? = null
    var btnsubtract: Button? = null
    var btnmultiply: Button? = null
    var btnmodulus: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvanswer: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnum1 = findViewById(R.id.etnum1)
        etnum2= findViewById(R.id.etnum2)
        btnadd = findViewById(R.id.btnadd)
        btnmodulus = findViewById(R.id.btnmodulus)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnsubtract = findViewById(R.id.btnsubtract)
        tvanswer = findViewById(R.id.tvanswer)
        Clicklistener()
    }

    fun Clicklistener() {
        btnadd!!.setOnClickListener {
            num1 = etnum1!!.text.toString().toDouble()
            num2 = etnum2!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvanswer!!.text = result.toString()
        }
        btnsubtract!!.setOnClickListener {
            num1 = etnum1!!.text.toString().toDouble()
            num2 = etnum2!!.text.toString().toDouble()
            val result = num1!! - num2!!
            tvanswer!!.text = result.toString()
        }
        btnmultiply!!.setOnClickListener {
            num1 = etnum1!!.text.toString().toDouble()
            num2 = etnum2!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvanswer!!.text = result.toString()
        }
        btnmodulus!!.setOnClickListener {
            num1 = etnum1!!.text.toString().toDouble()
            num2 = etnum2!!.text.toString().toDouble()
            val result = num1!! / num2!!
            tvanswer!!.text = result.toString()
        }
    }
}







