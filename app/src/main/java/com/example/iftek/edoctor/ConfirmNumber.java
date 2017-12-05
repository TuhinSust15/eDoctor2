package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmNumber extends AppCompatActivity {
    Button btConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_number);

        btConfirm = (Button) findViewById(R.id.btConfirm);
        btConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookSuccess= new Intent(ConfirmNumber.this,Confirm.class);
                ConfirmNumber.this.startActivity(bookSuccess);
            }
        });
    }
}
