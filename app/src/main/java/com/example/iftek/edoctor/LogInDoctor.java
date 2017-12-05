package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInDoctor extends AppCompatActivity {

    EditText etDocEmailL;
    EditText etDocPassL;
    Button btDocL;
    TextView tvDocRegdHereL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_doctor);
        etDocEmailL=(EditText) findViewById(R.id.etDocEmailL);
        etDocPassL=(EditText) findViewById(R.id.etDocPassL);
        final Button btDocL=(Button) findViewById(R.id.btDocL);
        final TextView tvShow=(TextView) findViewById(R.id.tvShow);
        final TextView tvDocRegdHereL= (TextView) findViewById(R.id.tvDocRegdHereL);

       btDocL.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent HomePgDoc= new Intent(LogInDoctor.this,HomePage4Doctor.class);
               LogInDoctor.this.startActivity(HomePgDoc);
           }
       });
        tvDocRegdHereL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent= new Intent(LogInDoctor.this,RegistrationDoctor.class);
                LogInDoctor.this.startActivity(registerIntent);
            }
        });
    }
}
