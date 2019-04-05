package com.example.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentEntry extends AppCompatActivity {

    private EditText Name;
    private Button btnEntry;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_entry);



        Name = findViewById(R.id.editTextName);

        btnEntry = findViewById(R.id.btnEnter);

        btnEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name=Name.getText().toString();

                final Student s1 = new Student(name);
                //String name = Name.getText().toString();

                Intent intent = new Intent(StudentEntry.this, Result.class);
               intent.putExtra("Name", s1);

                startActivity(intent);


            }
        });

      /* // Intent i = getIntent();


        Bundle mbundle= getIntent().getExtras();
        if(mbundle!=null)
        {
            if(mbundle.containsKey("name"))
            {
                String name=mbundle.getString("name");
                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
        }



        btnEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editTextName.getText().toString();



                Intent mIntent=new Intent(StudentEntry.this,Result.class);
                mIntent.putExtra("stud",s1);

                startActivity(mIntent);

            }
        });
*/
    }
}
