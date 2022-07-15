package id.coedotz.jmphelloworld.kotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.jmphelloworld.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<Button>(R.id.btnOk)
        btnOk.setOnClickListener {
            btnOk.setBackgroundColor(Color.RED)
        }
    }
}