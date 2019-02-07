package com.example.apppeyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

public class UnAvailable extends AppCompatActivity {

    private SwitchCompat su;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un_available);

        su=(SwitchCompat)findViewById(R.id.su);
        su.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (su.isChecked()) {
                    Intent i=new Intent(UnAvailable.this,Available.class);
                    startActivity(i);

                } else {


                }
            }

        });
    }
}
