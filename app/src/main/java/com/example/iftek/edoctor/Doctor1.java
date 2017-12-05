package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor1 extends AppCompatActivity {
    Button btProceed2Doc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor1);

        Button btProceed2Doc1 = (Button) findViewById(R.id.btProceed2Doc1);
        btProceed2Doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doc1Book= new Intent(Doctor1.this,Doc1Book.class);
                Doctor1.this.startActivity(doc1Book);
            }
        });
    }
}
