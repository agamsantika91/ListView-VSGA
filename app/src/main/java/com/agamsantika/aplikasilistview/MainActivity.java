package com.agamsantika.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda",
            "Argentina", "Chile",
            "Mesir", "Uganda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("ListView Sederhana");

        ListView lvItem = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                namanegara
        );
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}