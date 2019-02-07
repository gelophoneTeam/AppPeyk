package com.example.apppeyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

public class PeykActivity extends AppCompatActivity {

    private SwitchCompat toggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peyk);

        toggleBtn=(SwitchCompat)findViewById(R.id.toggleBtn);
        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (toggleBtn.isChecked()) {

                    Intent i=new Intent(PeykActivity.this,Available.class);
                    startActivity(i);

                } else {

                    Intent i=new Intent(PeykActivity.this,UnAvailable.class);
                    startActivity(i);

                }
            }

        });
    }
}
