package id.coedotz.jmplatihanmenu.java;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import id.coedotz.jmplatihanmenu.R;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenujava, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1Java.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, Menu2Java.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, Menu3Java.class));
        }
        return true;
    }
}