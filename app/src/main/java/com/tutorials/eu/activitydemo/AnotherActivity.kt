package com.tutorials.eu.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
  val keyValue1 =intent.getStringArrayExtra("key1")
        val keyValue2 = intent.getDoubleExtra("key2",0.0)
        val txt1= findViewById<TextView>(R.id.textView3)
        txt1.setText(keyValue1.toString())
        val txt2= findViewById<TextView>(R.id.textView4)
        txt2.setText(keyValue2.toString())


    }
}