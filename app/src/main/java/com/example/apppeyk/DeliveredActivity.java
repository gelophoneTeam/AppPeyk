package com.example.apppeyk;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.ListView;

import com.android.graphics.CanvasView;

public class DeliveredActivity extends AppCompatActivity {


    public static int[] osImages = {
            R.drawable.ic_moped,
            R.drawable.ic_prescription,
            R.drawable.ic_order,
    };

    ListView listview;

    public static String[] osNameList = {
            "تحویل گرفتم.",
            "نسخه را دریافت کردم.",
            "تحویل دادم.",


    };

    private SwitchCompat switchCompat;

    private CanvasView canvas = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivered);


        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new Adaptor(this, osNameList, osImages));


        this.canvas = (CanvasView)this.findViewById(R.id.canvas);

        this.canvas.clear();  // Clear canvas
        this.canvas.setMode(CanvasView.Mode.DRAW);    // for drawing
        this.canvas.setMode(CanvasView.Mode.ERASER);  // for using Eraser
        this.canvas.setBaseColor(Color.BLUE);



        switchCompat=(SwitchCompat)findViewById(R.id.sa);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switchCompat.isChecked()) {


                    Intent i=new Intent(DeliveredActivity.this,Available.class);
                    startActivity(i);

                } else {

                    Intent i=new Intent(DeliveredActivity.this,UnAvailable.class);
                    startActivity(i);

                }
            }

        });


    }
}
