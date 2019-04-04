package com.example.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       textViewName = findViewById(R.id.editTextName);

       /* Intent i=getIntent();
        Student studobj = (Student) i.getExtras().getSerializable("stud");

*/
       // name.setText("Student ID:"+studobj.getSid());
    }
}
