package com.jaydeep.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var logout: Button
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Ironman"
        sharedPreferences= getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.scrollview_example)
        title= sharedPreferences.getString("title","Avengers")


        logout= findViewById(R.id.logout)

        logout.setOnClickListener {
            val intent= Intent(this@MainActivity, LoginActivity::class.java);
            startActivity(intent)
            sharedPreferences.edit().putBoolean("isLoggedIn",false).apply()
            finish()
        }
    }

}


