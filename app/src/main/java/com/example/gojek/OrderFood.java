package com.example.gojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OrderFood extends AppCompatActivity implements View.OnClickListener {

    Button orderan;
    EditText order1;
    EditText order2;
    EditText order3;

    String nama,alamat,pesan;
    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        orderan = findViewById(R.id.btn_order);
        orderan.setOnClickListener(this);
        order1 = (EditText)findViewById(R.id.nama);
        order2 = (EditText)findViewById(R.id.alamat);
        order3 = (EditText)findViewById(R.id.pesan);

    }

    @Override
    public void onClick(View v){

        nama = order1.getText().toString();
        alamat = order2.getText().toString();
        pesan = order3.getText().toString();
        Intent orderan = new Intent(OrderFood.this, OrderProses.class);
        orderan.putExtra("nama",nama);
        orderan.putExtra("alamat",alamat);
        orderan.putExtra("pesan",pesan);
        startActivity(orderan);
    }
}
