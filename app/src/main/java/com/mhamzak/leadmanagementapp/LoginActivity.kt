package com.mhamzak.leadmanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        prepareView()
        prepareData()

    }

    private fun prepareView(){
        setupButton()
    }

    private fun prepareData(){

    }

    private fun setupButton(){
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            print("Button Tapped")
        }
    }
}