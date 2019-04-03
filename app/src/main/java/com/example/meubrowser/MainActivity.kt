package com.example.meubrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val i = intent
        if (i != null) {
            val str = i.dataString ?: "Nenhuma informação"
            findViewById<TextView>(R.id.txt).text = str
        }

    }
}
