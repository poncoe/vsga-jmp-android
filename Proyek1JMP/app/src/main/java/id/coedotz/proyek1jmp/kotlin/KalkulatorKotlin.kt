package id.coedotz.proyek1jmp.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.proyek1jmp.R

class KalkulatorKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_kotlin)

        val etAngka1 = findViewById<EditText>(R.id.input_angka1)
        val etAngka2 = findViewById<EditText>(R.id.input_angka2)

        val btnTambah = findViewById<Button>(R.id.btn_plus)
        val btnKurang = findViewById<Button>(R.id.btn_kurang)
        val btnKali = findViewById<Button>(R.id.btn_kali)
        val btnBagi = findViewById<Button>(R.id.btn_bagi)
        val btnBersihkan = findViewById<Button>(R.id.btn_bersihkan)

        val txtHasil = findViewById<TextView>(R.id.txt_hasil_kalkulator)

        // TAMBAH
        btnTambah.setOnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 + angka2
            txtHasil.text = "Hasil\n$hasil"
        }

        // KURANG
        btnKurang.setOnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 - angka2
            txtHasil.text = "Hasil\n$hasil"
        }

        // KALI
        btnKali.setOnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 * angka2
            txtHasil.text = "Hasil\n$hasil"
        }

        // BAGI
        btnBagi.setOnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 / angka2
            txtHasil.text = "Hasil\n$hasil"
        }

        // BERSIHKAN
        btnBersihkan.setOnClickListener {
            etAngka1.setText("")
            etAngka2.setText("")
            txtHasil.text = ""
        }
    }
}