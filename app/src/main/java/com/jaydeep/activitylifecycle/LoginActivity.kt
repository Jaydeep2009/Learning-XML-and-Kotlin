package com.jaydeep.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    lateinit var mobile: EditText
    lateinit var password: EditText
    lateinit var login: Button
    lateinit var forgotPassword: TextView
    lateinit var registerYourself: TextView
    lateinit var sharedPreferences: SharedPreferences

    val validMobile="9876543210"
    val validPassword= arrayOf("tony","hulk","thor","steve")
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "login"

        sharedPreferences= getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)
        var isLoggedIn=sharedPreferences.getBoolean("isLoggedIn",false)
        setContentView(R.layout.activity_login)
        if(isLoggedIn){
            val intent= Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        // Initialize views
        mobile = findViewById(R.id.mobile)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        forgotPassword = findViewById(R.id.forgotPassword)
        registerYourself = findViewById(R.id.registerYourself)



        // Set click listeners
        login.setOnClickListener {
            var mobile_txt= mobile.text.toString();
            var password_txt=password.text.toString();
            var nameOfAvenger="Avenger"

            if(mobile_txt==validMobile) {

                val intent = Intent(this@LoginActivity, MainActivity::class.java)

                if (validPassword.contains(password_txt)) {
                    if (password_txt == validPassword[0]) {
                        nameOfAvenger = "Tony Stark"
                        savePreferences(nameOfAvenger)
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    } else if (password_txt == validPassword[1]) {
                        nameOfAvenger = "Hulk"
                        savePreferences(nameOfAvenger)
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    } else if (password_txt == validPassword[2]) {

                        nameOfAvenger = "Thor"
                        savePreferences(nameOfAvenger)
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    } else if (password_txt == validPassword[3]) {
                        nameOfAvenger = "Steve"
                        savePreferences(nameOfAvenger)
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }else{
                        Toast.makeText(
                            this@LoginActivity,
                            "Invalid password",
                            Toast.LENGTH_SHORT
                        )
                    }
                }

            }else{
                Toast.makeText(
                    this@LoginActivity,
                    "Invalid credentials!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
//        forgotPassword.setOnClickListener(this)
//        registerYourself.setOnClickListener(this)
    }


    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savePreferences(title:String){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("title",title).apply()
    }


}
