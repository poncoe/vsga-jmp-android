package id.coedotz.jmplatihanstoragedgnsqlite.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import id.coedotz.jmplatihanstoragedgnsqlite.R
import java.io.*

class InternalStorageKotlin : AppCompatActivity(), View.OnClickListener {
    lateinit var buatFile: Button
    lateinit var ubahFile: Button
    lateinit var bacaFile: Button
    lateinit var deleteFile: Button
    lateinit var textBaca: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internal_storage_kotlin)

        buatFile = findViewById(R.id.buttonBuatFile)
        ubahFile = findViewById(R.id.buttonUbahFile)
        bacaFile = findViewById(R.id.buttonBacaFile)
        deleteFile = findViewById(R.id.buttonHapusFile)
        textBaca = findViewById(R.id.textBaca)

        buatFile.setOnClickListener(this)
        ubahFile.setOnClickListener(this)
        bacaFile.setOnClickListener(this)
        deleteFile.setOnClickListener(this)
    }

    fun buatFile() {
        val isiFile = "Hello Coedotz"
        val file = File(filesDir, FILENAME)
        var outputStream: FileOutputStream? = null
        try {
            file.createNewFile()
            outputStream = FileOutputStream(file, true)
            outputStream.write(isiFile.toByteArray())
            outputStream.flush()
            outputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun ubahFile() {
        val ubah = "Data ini telah diubah oleh Coedotz"
        val file = File(filesDir, FILENAME)
        var outputStream: FileOutputStream? = null
        try {
            file.createNewFile()
            outputStream = FileOutputStream(file, false)
            outputStream.write(ubah.toByteArray())
            outputStream.flush()
            outputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun bacaFile() {
        val sdcard = filesDir
        val file = File(sdcard, FILENAME)
        if (file.exists()) {
            val text = StringBuilder()
            try {
                val br = BufferedReader(FileReader(file))
                var line = br.readLine()
                while (line != null) {
                    text.append(line)
                    line = br.readLine()
                }
                br.close()
            } catch (e: IOException) {
                println("Error :" + e.message)
            }
            textBaca!!.text = text.toString()
        }
    }

    fun hapusFile() {
        val file = File(filesDir, FILENAME)
        if (file.exists()) {
            file.delete()
        }
    }

    override fun onClick(v: View) {
        jalankanPerintah(v.id)
    }

    fun jalankanPerintah(id: Int) {
        when (id) {
            R.id.buttonBuatFile -> buatFile()
            R.id.buttonBacaFile -> bacaFile()
            R.id.buttonUbahFile -> ubahFile()
            R.id.buttonHapusFile -> hapusFile()
        }
    }

    companion object {
        const val FILENAME = "namafile.txt"
    }
}