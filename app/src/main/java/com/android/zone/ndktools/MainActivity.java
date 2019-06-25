package com.android.zone.ndktools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private NDKTools jni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jni=new NDKTools(getApplicationContext());
        findViewById(R.id.bt_javaInt).setOnClickListener(this);
        findViewById(R.id.bt_javanull).setOnClickListener(this);
        findViewById(R.id.bt_javaString).setOnClickListener(this);
        findViewById(R.id.bt_static).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_javanull:
                jni.callbackmethod();
                break;
            case R.id.bt_javaInt:
                jni.callbackIntmethod();
                break;
            case R.id.bt_javaString:
                jni.callbackStringmethod();
                break;
            case R.id.bt_static:
                jni.callStaticmethod();
                break;
        }
    }
}
