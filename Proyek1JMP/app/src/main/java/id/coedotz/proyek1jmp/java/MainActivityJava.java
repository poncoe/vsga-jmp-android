package id.coedotz.proyek1jmp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import id.coedotz.proyek1jmp.R;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenujava, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, InputDataJava.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, KalkulatorJava.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, ListViewJava.class));
        }
        return true;
    }
}