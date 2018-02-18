package com.example.muhammadfarhan.farhan_1202144152_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    private EditText a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        //melakukan inisiasi TextInputLayout dengan menggunakan id
        a = (EditText) findViewById(R.id.name);
        b = (EditText) findViewById(R.id.phone);
        c = (EditText) findViewById(R.id.address);
        d = (EditText) findViewById(R.id.notes);
    }

    public void pilihPesanan(View view){
        String nama = a.getText().toString();
        String nomor = b.getText().toString();
        String alamat = c.getText().toString();
        String catatan = d.getText().toString();

        if (nama.isEmpty()|| nomor.isEmpty()|| alamat.isEmpty()|| catatan.isEmpty()){
            Toast.makeText(this,"Data Harus Diisi", Toast.LENGTH_LONG).show();
        }
        //mengirimkan nama dan jumlah ke dlm intent agar bisa di get pada class yang dituju
        Intent intent = new Intent(TakeAway.this,DaftarMenu.class);
        startActivity(intent);


    }
}
