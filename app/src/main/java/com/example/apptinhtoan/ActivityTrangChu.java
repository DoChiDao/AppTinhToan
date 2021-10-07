package com.example.apptinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTrangChu extends AppCompatActivity {
    private EditText soA;
    private EditText soB;
    private EditText kQ;
    private Button tong2So;
    private Button hieu2So;
    private Button tich2So;
    private Button thuong2So;
    private Button thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        this.soA = (EditText) this.findViewById(R.id.editTextNumber1);
        this.soB = (EditText) this.findViewById(R.id.editTextNumber2);
        this.kQ = (EditText) this.findViewById(R.id.editTextNumber3);
        this.tong2So = (Button) this.findViewById(R.id.button01);
        this.hieu2So = (Button) this.findViewById(R.id.button02);
        this.tich2So = (Button) this.findViewById(R.id.button03);
        this.thuong2So = (Button) this.findViewById(R.id.button04);
        this.thoat = (Button)this.findViewById(R.id.button6);


        this.tong2So.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityTrangChu.this, "Phép tính đã thực hiện",Toast.LENGTH_SHORT).show();

                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int kqua = a + b;
                kQ.setText(String.valueOf(kqua));
            }
        });
        this.hieu2So.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityTrangChu.this, "Phép tính đã thực hiện",Toast.LENGTH_SHORT).show();
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int kqua = a - b ;
                kQ.setText(String.valueOf(kqua));

            }
        });
        this.tich2So.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityTrangChu.this, "Phép tính đã thực hiện",Toast.LENGTH_SHORT).show();
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int kqua = a * b;
                kQ.setText(String.valueOf(kqua));
            }

        });
        this.thuong2So.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                if(b == 0 ){
                     soB.setText("Hãy nhập lại B! ");
                }else{
                    kQ.setText(String.valueOf(a/b));
                } */

                double a = Double.parseDouble(soA.getText().toString());
                double b = Double.parseDouble(soB.getText().toString());
                if(b==0){
                    Toast.makeText(ActivityTrangChu.this, "Thực hiện phép tính thất bại",Toast.LENGTH_SHORT).show();
                    soB.setText("Hãy nhập lại B!");
                    soB.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            soB.getText().clear();
                        }
                    });
                }else{
                    Toast.makeText(ActivityTrangChu.this, "Phép tính đã thực hiện",Toast.LENGTH_SHORT).show();
                    kQ.setText(String.valueOf(a/b));
                }
            }

        });
        this.thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityTrangChu.this.finish();
            }
        });

    }
}