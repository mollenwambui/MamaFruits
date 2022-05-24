package com.example.mama_fruits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Types : AppCompatActivity() {
    lateinit var btnApple:Button
    lateinit var btnMango:Button
    lateinit var btnPineapple:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_types)
        btnPineapple=findViewById(R.id.btnPineapple)
        btnMango=findViewById(R.id.btnMango)
        btnApple=findViewById(R.id.btnApple)
        btnApple.setOnClickListener {
            val intent=Intent(this,AppleJuice::class.java)
            startActivity(intent)
        }
        btnMango.setOnClickListener {
            val intent=Intent(this,MangoJuice::class.java)
            startActivity(intent)
        }
        btnPineapple.setOnClickListener {
            val intent=Intent(this,PineappleJuice::class.java)
            startActivity(intent)
        }
    }
}