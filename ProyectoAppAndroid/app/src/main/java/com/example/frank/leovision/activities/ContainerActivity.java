package com.example.frank.leovision.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.frank.leovision.R;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        CharSequence text = "XXXXXXXXXXXXXXXXXXX!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

    }
}
