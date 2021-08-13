package com.example.uas_akb_2021_if10_10118425.View;

import android.content.Intent;

import androidx.core.view.ContentInfoCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.example.uas_akb_2021_if10_10118425.R;

import static androidx.core.content.ContextCompat.startActivity;

/**
 *  NIM : 10118425
 *  Nama : Aditya Rizky Fauzi
 *  Kelas : IF-10
 *  Tanggal Pengerjaan : 10-08-2021 - 14-08-2021
 * */
public class SplashActivity extends AwesomeSplash {
    @Override
    public <ConfigSplash> void initSplash(ConfigSplash configSplash){
        getSupportActionBar().hide();
        //mammalian background
        configSplash.setBackgroundColor(R.color.colorAccent);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(ContentInfoCompat.Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(ContentInfoCompat.Flags.REVEAL_BOTTOM);

        //menambahkan logo
        configSplash.setLogoSplash(R.drawable.splash);
        configSplash.setAnimLogoSplashDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);

        //menambahkan title
        configSplash.setTitleSplash("Ayo Jalan-Jalan!");
        configSplash.setTitleTextColor(R.color.colorPrimaryDark);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.ZoomIn);
    }

    private WindowInsetsControllerCompat getSupportActionBar() {
        return null;
    }

    @Override
    public void animationsFinished(){
        startActivity(new Intent(SplashActivity.this, OnBoardSliderActivity.class));
    }
}

