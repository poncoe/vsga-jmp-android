package id.coedotz.proyek2jmp.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.proyek2jmp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.input_username)
        val etPassword = findViewById<EditText>(R.id.input_password)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            if (username.equals("jmp-a", ignoreCase = true) && password.equals("123", ignoreCase = true)) {
                val intent = Intent(this@MainActivity, ListNegaraKotlin::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Password atau Username salah!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}