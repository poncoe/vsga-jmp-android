package id.coedotz.tugas4jmp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menujava, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuUlangi) {
            Toast toast = Toast.makeText(getApplicationContext(), "Tombol Ulangi diklik!", Toast.LENGTH_SHORT);
            toast.show();
        } else if (item.getItemId() == R.id.menuKeluar) {
            this.finish();
        }
        return true;
    }
}