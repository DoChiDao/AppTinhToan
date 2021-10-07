package com.example.apptinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button nutbd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nutbd = (Button) this.findViewById(R.id.button00);
        this.nutbd.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ActivityTrangChu.class );
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}