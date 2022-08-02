package id.coedotz.proyek1jmp.kotlin

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.proyek1jmp.R

class ListViewKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_kotlin)

        val negara = resources.getStringArray(R.array.daftar_negara)

        val lvNegara = findViewById<ListView>(R.id.list_negara)

        lvNegara.onItemClickListener =
            OnItemClickListener { _, _, i, _ ->
                Toast.makeText(
                    this,
                    "Terpilih " + negara[i],
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}