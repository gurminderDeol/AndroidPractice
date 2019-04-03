package com.example.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentEntry extends AppCompatActivity {

    private EditText editTextName;
    private Button btnEntry;
String name;


    StudentEntry(String name)
    {
        this.name = name;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_entry);

        editTextName = findViewById(R.id.editTextName);

         name=editTextName.getText().toString();

        StudentEntry s1 = new StudentEntry(name);

        btnEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editTextName.getText().toString();



                Intent mIntent=new Intent(StudentEntry.this,Result.class);
               // mIntent.putExtra("stud",s1);
                startActivity(mIntent);
            }
        });

    }
}
