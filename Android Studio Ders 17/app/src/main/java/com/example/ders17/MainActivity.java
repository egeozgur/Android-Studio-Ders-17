package com.example.ders17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.ayarlar){
            Toast.makeText(getApplicationContext(),"Ayarlar Butonuna tıklandı",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.profil){
            Toast.makeText(getApplicationContext(),"Profil Butonuna tıklandı",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.arama){
            Toast.makeText(getApplicationContext(),"Arama Butonuna tıklandı",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}