package id.coedotz.proyek1jmp.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import id.coedotz.proyek1jmp.R
import id.coedotz.proyek1jmp.java.KalkulatorJava

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu1) {
           // startActivity(Intent(this, Menu1Java::class.java))
        } else if (item.itemId == R.id.menu2) {
            startActivity(Intent(this, KalkulatorJava::class.java))
        } else if (item.itemId == R.id.menu3) {
           // startActivity(Intent(this, Menu3Java::class.java))
        }
        return true
    }
}