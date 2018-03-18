package com.example.yoelfebryan.yoel_1202150036_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list,gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (Button)findViewById(R.id.listmahasiswa);
        gambar = (Button)findViewById(R.id.carigambar);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListmahasiswaActivity.class);
                startActivity(intent);
            }
        });

        gambar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CarigambarActivity.class);
                startActivity(intent);
            }
        }));
    }
}
