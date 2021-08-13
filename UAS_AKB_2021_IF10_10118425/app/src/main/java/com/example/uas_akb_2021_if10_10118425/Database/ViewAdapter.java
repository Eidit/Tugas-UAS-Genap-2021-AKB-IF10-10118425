package com.example.uas_akb_2021_if10_10118425.Database;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 *  NIM : 10118425
 *  Nama : Aditya Rizky Fauzi
 *  Kelas : IF-10
 *  Tanggal Pengerjaan : 10-08-2021 - 14-08-2021
 * */
public class ViewAdapter extends FragmentPagerAdapter {
    public final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
