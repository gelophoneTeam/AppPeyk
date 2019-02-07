package com.example.apppeyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;


public class Available extends AppCompatActivity {

    private SwitchCompat sa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);

        sa=(SwitchCompat)findViewById(R.id.sa);
        sa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sa.isChecked()) {

                } else {

                    Intent i=new Intent(Available.this,UnAvailable.class);
                    startActivity(i);

                }
            }

        });
     
    }
}
