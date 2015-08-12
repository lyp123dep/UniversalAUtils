package com.boka.framework.universalautils;

import android.app.Activity;

import android.os.Bundle;

import com.wtm.library.base.activity.DeBugActivity;


public class MainActivity extends DeBugActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
