package id.coedotz.proyek2jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.coedotz.proyek2jmp.R;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

        EditText etUsername = findViewById(R.id.input_username);
        EditText etPassword = findViewById(R.id.input_password);

        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.equalsIgnoreCase("jmp-a") && password.equalsIgnoreCase("123")){
                    Intent intent = new Intent(MainActivityJava.this, ListNegaraJava.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivityJava.this, "Password atau Username salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}