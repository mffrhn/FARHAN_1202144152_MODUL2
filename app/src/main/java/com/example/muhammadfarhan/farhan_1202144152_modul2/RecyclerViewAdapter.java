package com.example.muhammadfarhan.farhan_1202144152_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData, rvHarga;
    private ArrayList<Integer> gambar;

    public RecyclerViewAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        //ditutorial ini kita hanya menggunakan data string dan integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitile;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //untuk menghubungkan dan mendapatkan context dari main activity
            context = itemView.getContext();

            //melakukan inisiasi textview, imageview dan linearlayout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitile = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMenu.class);
                    String ingredient = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = " Espresso dengan lebih banyak air, sehingga rasa kopinya tidak begitu kuat";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Dibuat dari espresso dan coklat panas(harus sangat kuat dan pekat), kemudian diberi susu panas berbuih di atasnya ditambah bubuk coklat, kayu manis dan whipped cream";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "1/3 espresso, 1/3 susu, 1/3 busa susu";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Single Espresso: shot 1 ons,Double Espresso atau doppio: shot 2 ons";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Disajikan dengan ditambahkan steamed milk di bagian bawah pitcher ke single atau double espresso";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Iced coffee";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 6:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Mirip dengan Macchiato";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 7:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Merupakan jenis minuman kopi dingin es salju dengan whipped cream diatasnya.";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 8:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = " Coffee tanpa kafein";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 9:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Campuran Espresso dan susu cair panas dengan perbandingan 1:2,Kopi dituang sampai 75% gelas terisi, kemudian busanya baru dituangkan diatasnya";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 10:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = " Kopi yang diberi tambahan 25 ml Liquor";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 11:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "Espresso dengan sedikit susu panas dan coklat bubuk";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        //mengeset ukuran view, margin, padding, dan prametet layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        //mengambil elemen dari dataset (arraylist) padda posisi tertentu
        //mengeset isi view dgn elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer text = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitile.setText(harga);
        holder.a.setImageResource(text);
    }

    @Override
    public int getItemCount(){
        //menghitung ukuran dataset/ jumlah data yang ditampilkan di recycleview
        return rvData.size();
    }
}