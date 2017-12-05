package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPatient extends AppCompatActivity {
    EditText etPatEmailL;
    EditText etPatPassL;
    Button btDocL;
    TextView tvPatRegdHereL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_patient);

        etPatEmailL=(EditText) findViewById(R.id.etPatEmailL);
        etPatPassL=(EditText) findViewById(R.id.etPatPassL);
         Button btPatL=(Button) findViewById(R.id.btPatL);
         TextView tvShowP=(TextView) findViewById(R.id.tvShowP);
        TextView tvPatRegdHereL= (TextView) findViewById(R.id.tvPatRegdHereL);

        btPatL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomepgPat= new Intent(LoginPatient.this,HomePage4Patient.class);
                LoginPatient.this.startActivity(HomepgPat);
            }
        });
        tvPatRegdHereL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntentP= new Intent(LoginPatient.this,RegistrationPatient.class);
                LoginPatient.this.startActivity(registerIntentP);
            }
        });
    }
}
