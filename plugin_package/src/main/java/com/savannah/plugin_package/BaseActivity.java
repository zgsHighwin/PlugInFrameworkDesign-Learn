package com.savannah.plugin_package;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.savannah.stander.ActivityInterface;

public class BaseActivity extends AppCompatActivity implements ActivityInterface{
    public Activity appActivity;//缩主activity

    @Override
    public void insertAppContext(Activity appActivity) {
        this.appActivity = appActivity;
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onCreate(Bundle savedInstanceState) {
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onStart() {
    }

    @Override
    @SuppressLint("MissingSuperCall")
    public void onPause() {
    }

    @Override
    @SuppressLint("MissingSuperCall")
    public void onResume() {
    }

    @Override
    @SuppressLint("MissingSuperCall")
    public void onStop() {
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onDestroy() {
    }
}
