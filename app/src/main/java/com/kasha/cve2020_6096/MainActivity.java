package com.kasha.cve2020_6096;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.kasha.cve2020_6096.R;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'exploit' library on application startup.
    static {
        System.loadLibrary("exploit");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'exploit' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
