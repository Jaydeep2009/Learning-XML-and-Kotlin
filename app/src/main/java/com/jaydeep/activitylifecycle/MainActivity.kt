package com.jaydeep.activitylifecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jaydeep.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_relative_layout)
        println("Oncreate")
    }

    override fun onStart() {
        super.onStart()
        println("Onstart")
    }

    override fun onResume() {
        super.onResume()
        println("OnResume")
    }

    override fun onPause() {
        super.onPause()
        println("OnPause")
    }

    override fun onStop() {
        super.onStop()
        println("OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("OnRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy")
    }


}

