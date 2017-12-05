package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doc1Book extends AppCompatActivity {
    Button slot1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc1_book);

        slot1 = (Button) findViewById(R.id.slot1);

        slot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmNumber= new Intent(Doc1Book.this,ConfirmNumber.class);
                startActivity(confirmNumber);
            }
        });

    }
}
