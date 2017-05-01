package com.lucidleanlabs.dev.zip;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    String Location = Environment.getExternalStorageDirectory() + "/L_CATALOGUE/";
    String StorezipFileLocation = Environment.getExternalStorageDirectory() + "/L_CATALOGUE/Sofa_3_Seater_Black_Grey.zip";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UnzipUtil unzipUtil = new UnzipUtil(StorezipFileLocation, Location);
                unzipUtil.unzip();
            }
        });


    }
}