package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationPatient extends AppCompatActivity {
    EditText etPatNameR,etPatPhoneR,etPatEmailR,etPatPassR,etPatDoBR,etPatSR;
    Button btPatR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_patient);

        etPatNameR = (EditText) findViewById(R.id.etPatNameR);
        etPatPhoneR = (EditText) findViewById(R.id.etPatPhoneR);
        etPatEmailR = (EditText) findViewById(R.id.etDocEmailR);
        etPatPassR = (EditText) findViewById(R.id.etPatPassR);
        etPatDoBR = (EditText) findViewById(R.id.etPatDoBR);
        etPatSR= (EditText) findViewById(R.id.etDocSR);
        btPatR=(Button) findViewById(R.id.btPatR);

        btPatR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginPat=new Intent(RegistrationPatient.this,LoginPatient.class);
                RegistrationPatient.this.startActivity(LoginPat);
            }
        });
    }
}
