package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView2)
        val buttonPlus = findViewById<Button>(R.id.button4)

        buttonPlus.setOnClickListener{
            i++
            textView.text = i.toString()

        }
        val buttonMinus = findViewById<Button>(R.id.button3)
        buttonMinus.setOnClickListener{
           if(i<0){
               i--
               textView.text = i.toString()
           }
            else{
                val text = "ошибка"
               val duration = Toast.LENGTH_SHORT
               val toast = Toast.makeText(applicationContext, text, duration)
               toast.show()
           }

        }
    }
}