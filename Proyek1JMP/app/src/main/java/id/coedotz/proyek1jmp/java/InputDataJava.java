package id.coedotz.proyek1jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.coedotz.proyek1jmp.R;

public class InputDataJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data_java);

        EditText etNama = findViewById(R.id.input_nama);
        Button btnProses = findViewById(R.id.btn_proses);
        TextView txtHasil = findViewById(R.id.txt_hasil);

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                txtHasil.setText(nama);
            }
        });

    }
}