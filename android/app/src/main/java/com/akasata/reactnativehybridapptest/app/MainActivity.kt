package com.akasata.reactnativehybridapptest.app


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.mainButton)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MyReactActivity::class.java)
            startActivity(intent)
        }
    }
}
