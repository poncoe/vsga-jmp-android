package id.coedotz.jmplatihansqlite.kotlin

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DatabaseHelper (context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_TABLE_STUDENTS)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS '$TABLE_STUDENTS'")
        onCreate(db)
    }

    fun addStudentDetail(student: String?): Long {
        val db = this.writableDatabase

        // create content values
        val values = ContentValues()
        values.put(
            KEY_FIRSTNAME,
            student
        )

        // insert row in student table
        return db.insert(TABLE_STUDENTS, null, values)
    }

    // looping all rows for adding to list
    val allStudentsList: ArrayList<String>
        get() {
            val studentsArrayList = ArrayList<String>()
            var name = ""
            val selectQuery = "SELECT * FROM $TABLE_STUDENTS"
            val db = this.readableDatabase
            val c = db.rawQuery(selectQuery, null)

            // looping all rows for adding to list
            if (c.moveToFirst()) {
                do {
                    name = c.getString(c.getColumnIndex(KEY_FIRSTNAME))
                    // adding to student list
                    studentsArrayList.add(name)
                } while (c.moveToNext())
                Log.d("Array", studentsArrayList.toString())
            }
            return studentsArrayList
        }

    companion object {
        var DATABASE_NAME = "student_database"
        private const val DATABASE_VERSION = 1
        private const val TABLE_STUDENTS = "students"
        private const val KEY_ID = "id"
        private const val KEY_FIRSTNAME = "name"
        private const val CREATE_TABLE_STUDENTS = ("CREATE TABLE "
                + TABLE_STUDENTS + "(" + KEY_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_FIRSTNAME + " TEXT );")
    }

    init {
        Log.d("table", CREATE_TABLE_STUDENTS)
    }
}