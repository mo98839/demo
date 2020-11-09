package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class demo extends Activity {
    Button b1;
    TextView tv1, tv2, tv3, tv4;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        tv1 = (TextView) tv1.findViewById(R.id.tv1);
        tv2 = (TextView) tv2.findViewById(R.id.tv2);
        tv3 = (TextView) tv3.findViewById(R.id.tv3);
        tv4 = (TextView) tv3.findViewById(R.id.tv4);

        b1 = (Button) b1.findViewById(R.id.b1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String cls = intent.getStringExtra("class");
        Integer total = intent.getIntExtra("total", 0);
        Integer percentage = intent.getIntExtra("percentage", 0);
        tv1.setText("name");
        tv2.setText("class");
        tv3.setText("total");
        tv4.setText("percentage");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(demo.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}