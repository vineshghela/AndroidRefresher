package com.example.acitivtyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add.*
import java.lang.Float.parseFloat


class Add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val number1 = intent.getStringExtra("no1")
        val number2 = intent.getStringExtra("no2")
        val opp = "Plus"
        val calc = parseFloat(number1) + parseFloat(number2)
        textView4.text = getString(R.string.calculation,opp, number1,number2,calc.toString())
    }

    fun sendMsg(view: View){
        val number1 = intent.getStringExtra("no1")
        val number2 = intent.getStringExtra("no2")
        val opp = "Plus"
        val calc = parseFloat(number1) + parseFloat(number2)
        val myStr = getString(R.string.calculation,opp, number1,number2,calc.toString())
        val TxtMsg = Intent(Intent.ACTION_SEND)
        TxtMsg.putExtra(Intent.EXTRA_TEXT, "this is so cool" )
        TxtMsg.type= "text/plain"
        startActivity(TxtMsg)

    }
}