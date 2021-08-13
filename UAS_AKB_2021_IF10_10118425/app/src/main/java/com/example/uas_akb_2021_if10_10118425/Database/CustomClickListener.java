package com.example.uas_akb_2021_if10_10118425.Database;

import android.view.View;

/**
 *  NIM : 10118425
 *  Nama : Aditya Rizky Fauzi
 *  Kelas : IF-10
 *  Tanggal Pengerjaan : 10-08-2021 - 14-08-2021
 * */
public class CustomClickListener  implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomClickListener(int position, CustomClickListener.OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    public interface  OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
