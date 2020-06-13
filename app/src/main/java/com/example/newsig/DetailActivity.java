package com.example.newsig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
        ImageView datagambar;
        TextView datanama,dataalamat,datarating;
        public static String id,nama,alamat,rating,gambar;
        public static Double Latitude,Longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        dataalamat=findViewById(R.id.tv_alamat);
        datarating=findViewById(R.id.tv_rating);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        datarating.setText(rating);
        dataalamat.setText(alamat);
        Picasso.get().load(gambar).into(datagambar);
    }
}
