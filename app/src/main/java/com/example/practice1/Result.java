package com.example.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    String name;
TextView textViewName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewName =   findViewById(R.id.tvName);

       /* Bundle mbundle = getIntent().getExtras();
        if(mbundle!=null)
        {
            if(mbundle.containsKey("Name"))
            {
                String name=mbundle.getString("Name");

                textViewName.setText("Name:" + name);
            }
        }

*/


        Intent i=getIntent();
        Student studobj = (Student) i.getExtras().getSerializable("Name");
        textViewName.setText("Name:" + studobj.getName());

       // name.setText("Student ID:"+studobj.getSid());
    }
}
