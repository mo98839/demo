package com.example.project2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button b1, b2, b3;
    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        EditText e1 = (EditText) findViewById(R.id.e1);
        EditText e2 = (EditText) findViewById(R.id.e2);
        EditText e3 = (EditText) findViewById(R.id.e3);
        EditText e4 = (EditText) findViewById(R.id.e4);

        Integer m1 = Integer.valueOf(e3.getText().toString());
        Integer m2 = Integer.valueOf(e4.getText().toString());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
            }
            int total = m1 + m2;
            int percentage = (m1 + m2) / 2;
            Intent intent = new Intent(MainActivity.this, demo.class);

            public void setIntent(Intent intent) {
                this.intent = intent;
                intent.putExtra("name", "helen");
                intent.putExtra("class", "g2");
                intent.putExtra("total", total);
                intent.putExtra("percentage", percentage);
                startActivity(intent);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");

            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
                b3.setText("exit");

            }
        });
    }
}