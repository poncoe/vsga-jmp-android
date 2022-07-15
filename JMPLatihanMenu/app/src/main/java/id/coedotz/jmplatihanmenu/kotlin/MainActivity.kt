package id.coedotz.jmplatihanmenu.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import id.coedotz.jmplatihanmenu.R
import id.coedotz.jmplatihanmenu.java.Menu1Java
import id.coedotz.jmplatihanmenu.java.Menu2Java
import id.coedotz.jmplatihanmenu.java.Menu3Java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.optionmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu1) {
            startActivity(Intent(this, Menu1Java::class.java))
        } else if (item.itemId == R.id.menu2) {
            startActivity(Intent(this, Menu2Java::class.java))
        } else if (item.itemId == R.id.menu3) {
            startActivity(Intent(this, Menu3Java::class.java))
        }
        return true
    }
}