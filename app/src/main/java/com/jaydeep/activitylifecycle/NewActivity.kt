package com.jaydeep.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity(){
    lateinit var mobile: EditText
    lateinit var password: EditText
    lateinit var login: Button
    lateinit var forgotPassword: TextView
    lateinit var registerYourself: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "login"

        // Initialize views
        mobile = findViewById(R.id.mobile)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        forgotPassword = findViewById(R.id.forgotPassword)
        registerYourself = findViewById(R.id.registerYourself)

        // Set click listeners
        login.setOnClickListener {

            Toast.makeText(
                this@NewActivity,
                "Login pressed!",
                Toast.LENGTH_SHORT
            ).show()

            val intent= Intent(this@NewActivity, MainActivity::class.java)
            startActivity(intent);
        }
//        forgotPassword.setOnClickListener(this)
//        registerYourself.setOnClickListener(this)
    }




}