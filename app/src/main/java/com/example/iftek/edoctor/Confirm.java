package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirm extends AppCompatActivity {

    Button btConfirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        btConfirmed =(Button) findViewById(R.id.btConfirmed);

        btConfirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back2Home= new Intent(Confirm.this,HomePage4Patient.class);
                Confirm.this.startActivity(back2Home);
            }
        });
    }
}
