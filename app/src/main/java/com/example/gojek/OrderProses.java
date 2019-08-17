package com.example.gojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OrderProses extends AppCompatActivity {
    String nama,alamat,pesan;
    Button cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        nama = getIntent().getStringExtra("nama");
        alamat = getIntent().getStringExtra("alamat");
        pesan = getIntent().getStringExtra("pesan");

        TextView order1 = findViewById(R.id.order);
        order1.setText(nama);
        TextView order2 = findViewById(R.id.order2);
        order2.setText(alamat);
        TextView order3 = findViewById(R.id.order3);
        order3.setText(pesan);

        cancel = findViewById(R.id.btn_cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(OrderProses.this, MainMenu.class);
                startActivity(kembali);
            }
        });
    }
}