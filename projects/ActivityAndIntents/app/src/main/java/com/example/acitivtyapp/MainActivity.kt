package com.example.acitivtyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float.parseFloat

class MainActivity : AppCompatActivity() {
    val name =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun add (view:View){
        val intent = Intent(this@MainActivity,Add::class.java)
        val input1 = editTextNumber.text.toString()
        val input2 = editTextNumber2.text.toString()
        intent.putExtra("no1",input1)
        intent.putExtra("no2",input2)
        startActivity(intent)

    }
    fun sub(view:View){
        val input1 = editTextNumber.text.toString()
        val input2 = editTextNumber2.text.toString()
        val calc = parseFloat(input1) - parseFloat(input2)

    }

    fun mul(view:View){
        val input1 = editTextNumber.text.toString()
        val input2 = editTextNumber2.text.toString()
        val calc = parseFloat(input1) * parseFloat(input2)


    }

    fun div(view:View){
        val input1 = editTextNumber.text.toString()
        val input2 = editTextNumber2.text.toString()
        val calc = parseFloat(input1) / parseFloat(input2)


    }
}