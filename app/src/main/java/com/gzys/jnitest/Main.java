package com.gzys.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity {
    private String TAG = "jnitest";
    private TextView mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mytext = (TextView)findViewById(R.id.mytext);
        mytext.setText(hellojni());
        CallBack();
    }

    public native String hellojni();
    public native void CallBack();
    public void test() {
        Log.d(TAG,"callback test");
        Toast.makeText(Main.this,"callback test",Toast.LENGTH_LONG).show();
    }
    static {
        System.loadLibrary("mytest");
    }
}
