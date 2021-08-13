package com.example.uas_akb_2021_if10_10118425.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uas_akb_2021_if10_10118425.Database.CustomClickListener;
import com.example.uas_akb_2021_if10_10118425.Database.TourPlace;
import com.example.uas_akb_2021_if10_10118425.Database.TourPlaceHelper;
import com.example.uas_akb_2021_if10_10118425.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama, tvAlamat, tvWaktuBuka, tvDeskripsi;
    private ImageView tvFoto;
    private TourPlace tp;
    private TourPlaceHelper tpHelper;
    private ImageButton btnSubmit;
    private int position;

    /**
     *  NIM : 10118425
     *  Nama : Aditya Rizky Fauzi
     *  Kelas : IF-10
     *  Tanggal Pengerjaan : 10-08-2021 - 14-08-2021
     * */
    public static final String EXTRA_NOTE = "extra_note";
    public static final String EXTRA_POSITION = "extra_position";
    public static final int REQUEST_UPDATE = 200;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        tvNama = findViewById(R.id.nama_wisata);
        tvAlamat = findViewById(R.id.alamat);
        tvWaktuBuka = findViewById(R.id.waktuBuka);
        tvDeskripsi = findViewById(R.id.deskripsi);
        tvFoto = findViewById(R.id.gambar_wisata);
        btnSubmit = findViewById(R.id.btn_submit);

        tpHelper = TourPlaceHelper.getInstance(getApplicationContext());

        tp = getIntent().getParcelableExtra(EXTRA_NOTE);

        tvNama.setText(tp.getNama());
        tvAlamat.setText(tp.getAlamat());
        tvWaktuBuka.setText(tp.getWaktuBuka());
        tvDeskripsi.setText(tp.getDeskripsi());
        Glide.with(this)
                .asBitmap()
                .load(tp.getFoto())
                .into(tvFoto);

        btnSubmit.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(DetailActivity.this, MapActivity.class);
                intent.putExtra(DetailActivity.EXTRA_POSITION, position);
                intent.putExtra(DetailActivity.EXTRA_NOTE, tp);
                startActivity(intent);
            }
        }));
    }

}
