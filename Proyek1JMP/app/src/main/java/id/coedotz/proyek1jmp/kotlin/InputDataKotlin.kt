package id.coedotz.proyek1jmp.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.proyek1jmp.R

class InputDataKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data_kotlin)

        val etNama = findViewById<EditText>(R.id.input_nama)
        val btnProses = findViewById<Button>(R.id.btn_proses)
        val txtHasil = findViewById<TextView>(R.id.txt_hasil)

        btnProses.setOnClickListener {
            val nama = etNama.text.toString()
            txtHasil.text = nama
        }
    }
}