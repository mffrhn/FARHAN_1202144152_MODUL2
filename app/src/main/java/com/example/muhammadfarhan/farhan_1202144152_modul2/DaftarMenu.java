package com.example.muhammadfarhan.farhan_1202144152_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.TextView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar menu makanan
    private String[] Judul = {"Americano", "Cafe Mocha", "Cappucino", "Espresso", "Flat White", "Fredo", "Granitta", "Hag", "Latte", "Liqueur Coffee", "Macchiato", "Marocchino"};
    private String[] test = {"Rp. 15.000", "Rp. 25.000", "Rp. 30.000", "Rp. 25.000", "Rp. 15.000", "Rp. 40.000", "Rp. 45.000", "Rp. 35.000", "Rp. 45.000", "Rp. 55.000", "40.000", "35.000"};
    private int[] Gambar = {R.drawable.americano, R.drawable.cafemocha, R.drawable.cappuccino, R.drawable.espresso, R.drawable.flatwhite, R.drawable.fredo, R.drawable.granitta, R.drawable.hag, R.drawable.latte, R.drawable.liqueurcoffee, R.drawable.macchiato, R.drawable.marocchino};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

    }

    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }

    }
}
