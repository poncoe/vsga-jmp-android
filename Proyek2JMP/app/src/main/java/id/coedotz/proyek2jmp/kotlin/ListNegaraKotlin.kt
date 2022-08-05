package id.coedotz.proyek2jmp.kotlin

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.proyek2jmp.R

class ListNegaraKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_negara_kotlin)

        val listNegara = ArrayList<String>()
        listNegara.add("Indonesia")
        listNegara.add("Malaysia")
        listNegara.add("Thailand")
        listNegara.add("Kamboja")
        listNegara.add("Philipina")

        val etInputNegara = findViewById<EditText>(R.id.input_negara)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val listViewNegara = findViewById<ListView>(R.id.lv_negara)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listNegara)
        listViewNegara.adapter = adapter

        btnSubmit.setOnClickListener {
            val negara = etInputNegara.text.toString()
            if (!negara.equals("", ignoreCase = true)) {
                //adapter.add(negara);
                listNegara.add(negara)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this@ListNegaraKotlin, "Isian Kosong!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}