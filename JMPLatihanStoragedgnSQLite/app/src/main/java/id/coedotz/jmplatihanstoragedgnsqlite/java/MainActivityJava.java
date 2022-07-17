package id.coedotz.jmplatihanstoragedgnsqlite.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.coedotz.jmplatihanstoragedgnsqlite.R;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

        final Button btnInternal = findViewById(R.id.btnInternal);
        btnInternal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), InternalStorageJava.class);
                startActivity(i);
            }
        });
    }
}