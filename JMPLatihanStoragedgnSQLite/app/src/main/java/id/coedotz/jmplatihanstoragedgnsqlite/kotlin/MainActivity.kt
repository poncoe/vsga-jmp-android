package id.coedotz.jmplatihanstoragedgnsqlite.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.coedotz.jmplatihanstoragedgnsqlite.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInternal = findViewById<Button>(R.id.btnInternal)
        btnInternal.setOnClickListener {
            startActivity(Intent(this, InternalStorageKotlin::class.java))
        }
    }
}