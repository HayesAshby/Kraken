package com.example.hayzbomb.kraken;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.kraken.standalone.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GoogleSignin extends AppCompatActivity {

    @BindView(R.id.button) Button button;

    @OnClick(R.id.button)
    public void click() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_signin);
        ButterKnife.bind(this);
    }
}
