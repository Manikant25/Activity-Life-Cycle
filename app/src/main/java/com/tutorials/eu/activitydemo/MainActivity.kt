package com.tutorials.eu.activitydemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// TODO Step 1: Create a new project with Empty Activity and explain the project structure and all the things that you have explained in the Presentation.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnsubmit = findViewById<Button>(R.id.button)
        btnsubmit.setOnClickListener{
            val intent = Intent(this,AnotherActivity::class.java)
            startActivity(intent)
        }

        // TODO Step 2: Override all the lifecycle methods and print the log in it. After that just run and see which log is printed at what time.
        Log.e("onCreate method", "is called...")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart method", "is called...")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume method", "is called...")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause method", "is called...")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop method", "is called...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart method", "is called...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy method", "is called...")
    }


}