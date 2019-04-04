package com.example.practice1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_home extends AppCompatActivity {

    private EditText edtNum1;
    private EditText edtNum2;
    private Button btnAdd;
    private  TextView result;
    private Button btnEntry;
    private Double no1;
    private Double no2;
    private Double ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Bundle mbundle= getIntent().getExtras();

        if(mbundle!=null)
        {
            if(mbundle.containsKey("name"))
            {
                String name=mbundle.getString("name");
                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
        }


        edtNum1 = findViewById(R.id.editTextNumber1);
        edtNum2 = findViewById(R.id.editTextNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        result = findViewById(R.id.result);
        btnEntry = findViewById(R.id.btnEntry);

      /*  btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble()

        })

        */

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                no1 = Double.parseDouble ( edtNum1.getText().toString());
                no2 = Double.parseDouble(edtNum2.getText().toString());
                //msg.setTextColor(Color.RED);
                ans=no1+no2;
                result.setText(ans.toString());

            }
        });


        btnEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_home.this,StudentEntry.class);
                i.putExtra("name","jagmeet");
                startActivity(i);
            }
        });




    }
}
