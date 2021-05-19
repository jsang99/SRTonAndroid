package com.example.srtonandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnAtten;
    public Button btnStow;
    public Button btnTrack;
    public Button btnAzel;
    public Button btnNpoint;
    public Button btnBMSW;
    public Button btnFreq;
    public Button btnOffset;
    public Button btnDrift;
    public Button btnRecord;
    public Button btnRcmdfl;
    public Button btnCal;
    public Button btnVane;
    public Button btnHelp;

    public Button btnEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}