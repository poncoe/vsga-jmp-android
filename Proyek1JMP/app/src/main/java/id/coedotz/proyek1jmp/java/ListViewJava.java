package id.coedotz.proyek1jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import id.coedotz.proyek1jmp.R;

public class ListViewJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_java);

        String[] negara = getResources().getStringArray(R.array.daftar_negara);

        ListView lvNegara = findViewById(R.id.list_negara);

        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewJava.this, "Terpilih " + negara[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}