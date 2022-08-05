package id.coedotz.proyek2jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import id.coedotz.proyek2jmp.R;

public class ListNegaraJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_negara_java);

        ArrayList<String> listNegara = new ArrayList<>();
        listNegara.add("Indonesia");
        listNegara.add("Malaysia");
        listNegara.add("Thailand");
        listNegara.add("Kamboja");
        listNegara.add("Philipina");

        EditText etInputNegara = findViewById(R.id.input_negara);
        Button btnSubmit = findViewById(R.id.btn_submit);
        ListView listViewNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listNegara);
        listViewNegara.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String negara = etInputNegara.getText().toString();

                if(!negara.equalsIgnoreCase("")){
                    //adapter.add(negara);
                    listNegara.add(negara);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(ListNegaraJava.this, "Isian Kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}