package com.example.ejercicio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var send : Button
    private lateinit var tV : TextView
    private lateinit var eT : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        send=findViewById(R.id.button3)
        eT=findViewById(R.id.editTextTextPersonName)
        tV=findViewById(R.id.textView1)
        send.setOnClickListener {
            //Creamos el Intent
            tV.text=eT.text.toString()
        }
    }
}