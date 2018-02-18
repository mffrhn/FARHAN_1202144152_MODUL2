package com.example.muhammadfarhan.farhan_1202144152_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private Button a;
    private RadioGroup b;
    private RadioButton c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        a = (Button) findViewById(R.id.pesan);
        b = (RadioGroup) findViewById(R.id.pilih);
        c = (RadioButton) findViewById(R.id.dineIn);
        d = (RadioButton) findViewById(R.id.takeAway);
    }

    public void pesan(View view) {
        b = (RadioGroup) findViewById(R.id.pilih);
        c = (RadioButton) findViewById(R.id.dineIn);
        d = (RadioButton) findViewById(R.id.takeAway);
    }

    public void pilih(View view) {
        int selecteditem = b.getCheckedRadioButtonId();
        if (selecteditem == c.getId()){
            Toast.makeText(this, "Anda Memilih Dine In", Toast.LENGTH_LONG).show();

            Intent a = new Intent(MenuUtama.this,DineIn.class);
            startActivity(a);
        }
        else  if (selecteditem == d.getId()){
            Toast.makeText(this, "Anda Memilih Take Away", Toast.LENGTH_LONG).show();

            Intent a = new Intent(MenuUtama.this,TakeAway.class);
            startActivity(a);
        }
    }

    public void pilihpesanan(View view){
        //mengecek button
        boolean checked = ((RadioButton) view).isChecked();

        //mengecek button apa yang diklik
        switch (view.getId()){
            case R.id.takeAway:
                if (checked)
                    //method utk menampilkan pesan dan pindah layout ke Takeaway
                    take();
                break;
            case R.id.dineIn:
                if (checked)
                    //method utk menampilkan pesan dan pindah layput ke Dine In
                    dine();
                break;
        }
    }

    private void dine(){
        //Utk menampilkan pesan
        Toast.makeText(this,"Anda Memilih Dine In", Toast.LENGTH_LONG).show();

        //utk pindah ke laypur dine in
        Intent a = new Intent(MenuUtama.this,DineIn.class);
        startActivity(a);
    }

    private void take(){
        Toast.makeText(this,"Anda Memilih Take Away", Toast.LENGTH_LONG).show();
        Intent a = new Intent(MenuUtama.this,TakeAway.class);
        startActivity(a);
    }
}
