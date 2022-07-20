package id.coedotz.jmplatihansqlite.kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import id.coedotz.jmplatihansqlite.R

class MainActivity : AppCompatActivity() {
    private var btnStore: Button? = null
    private var btnGetall: Button? = null
    private var etname: EditText? = null
    private var databaseHelper: DatabaseHelper? = null
    private var tvnames: TextView? = null
    private var arrayList: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_java)

        databaseHelper = DatabaseHelper(this)
        tvnames = findViewById<View>(R.id.tvnames) as TextView
        btnStore = findViewById<View>(R.id.btnstore) as Button
        btnGetall = findViewById<View>(R.id.btnget) as Button
        etname = findViewById<View>(R.id.etname) as EditText

        btnStore!!.setOnClickListener {
            databaseHelper!!.addStudentDetail(etname!!.text.toString())
            etname!!.setText("")
            Toast.makeText(
                this@MainActivity, "Stored Successfully!",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnGetall!!.setOnClickListener {
            arrayList = databaseHelper!!.allStudentsList
            tvnames!!.text = ""
            for (i in arrayList!!.indices) {
                tvnames!!.text = tvnames!!.text.toString() + ", " + arrayList!!.get(i)
            }
        }
    }
}