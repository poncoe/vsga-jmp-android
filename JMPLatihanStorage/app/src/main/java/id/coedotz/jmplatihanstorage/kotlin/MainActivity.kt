package id.coedotz.jmplatihanstorage.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.coedotz.jmplatihanstorage.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInternal = findViewById<Button>(R.id.btnInternal)
        val btnExternal = findViewById<Button>(R.id.btnExternal)

        btnInternal.setOnClickListener {
            startActivity(Intent(this, InternalStorageKotlin::class.java))
        }

        btnExternal.setOnClickListener {
            startActivity(Intent(this, ExternalStorageKotlin::class.java))
        }
    }
}