package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationDoctor extends AppCompatActivity {
    EditText etDocNameR,etDocPhoneR,etDocEmailR,etDocPassR,etDocDoBR,etDocSR;
    Button btDocR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_doctor);

        etDocNameR = (EditText) findViewById(R.id.etDocNameR);
        etDocPhoneR = (EditText) findViewById(R.id.etDocPhoneR);
        etDocEmailR = (EditText) findViewById(R.id.etDocEmailR);
        etDocPassR = (EditText) findViewById(R.id.etDocPassR);
        etDocDoBR = (EditText) findViewById(R.id.etDocDoBR);
        etDocSR= (EditText) findViewById(R.id.etDocSR);
         btDocR=(Button) findViewById(R.id.btDocR);
        btDocR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginDoc= new Intent(RegistrationDoctor.this,LogInDoctor.class);
                startActivity(LoginDoc);
            }
        });

    }
}
