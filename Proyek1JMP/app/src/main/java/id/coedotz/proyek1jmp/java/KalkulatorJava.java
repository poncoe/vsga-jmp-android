package id.coedotz.proyek1jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.coedotz.proyek1jmp.R;

public class KalkulatorJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_java);

        EditText etAngka1 = findViewById(R.id.input_angka1);
        EditText etAngka2 = findViewById(R.id.input_angka2);

        Button btnTambah = findViewById(R.id.btn_plus);
        Button btnKurang = findViewById(R.id.btn_kurang);
        Button btnKali = findViewById(R.id.btn_kali);
        Button btnBagi = findViewById(R.id.btn_bagi);
        Button btnBersihkan = findViewById(R.id.btn_bersihkan);

        TextView txtHasil = findViewById(R.id.txt_hasil_kalkulator);

        // TAMBAH
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(etAngka1.getText().toString());
                double angka2 = Double.parseDouble(etAngka2.getText().toString());

                double hasil = angka1 + angka2;
                txtHasil.setText("Hasil\n"+hasil);

            }
        });

        // KURANG
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(etAngka1.getText().toString());
                double angka2 = Double.parseDouble(etAngka2.getText().toString());

                double hasil = angka1 - angka2;
                txtHasil.setText("Hasil\n"+hasil);

            }
        });

        // KALI
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(etAngka1.getText().toString());
                double angka2 = Double.parseDouble(etAngka2.getText().toString());

                double hasil = angka1 * angka2;
                txtHasil.setText("Hasil\n"+hasil);

            }
        });

        // BAGI
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(etAngka1.getText().toString());
                double angka2 = Double.parseDouble(etAngka2.getText().toString());

                double hasil = angka1 / angka2;
                txtHasil.setText("Hasil\n"+hasil);

            }
        });

        // BERSIHKAN
        btnBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAngka1.setText("");
                etAngka2.setText("");
                txtHasil.setText("");

            }
        });
    }
}