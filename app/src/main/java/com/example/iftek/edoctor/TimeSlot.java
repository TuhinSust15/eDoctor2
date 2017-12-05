package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.iftek.edoctor.R.id.spCity;

public class TimeSlot extends AppCompatActivity {

    Button btTimeSlot;
    Spinner spinnerHrs,spinnerMin,spinnerAmPm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_slot);

        spinnerHrs= (Spinner) findViewById(R.id.spinnerHrs);
        spinnerMin= (Spinner) findViewById(R.id.spinnerMin);
        spinnerAmPm= (Spinner) findViewById(R.id.spinnerAmPm);

        ArrayAdapter<CharSequence> adapterHrs = ArrayAdapter.createFromResource(this,
                R.array.spinnerHrs, android.R.layout.simple_spinner_item);
        spinnerHrs.setAdapter(adapterHrs);

        ArrayAdapter<CharSequence> adapterMin = ArrayAdapter.createFromResource(this,
                R.array.spinnerMin, android.R.layout.simple_spinner_item);
        adapterMin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMin.setAdapter(adapterMin);

        ArrayAdapter<CharSequence> adapterHalf = ArrayAdapter.createFromResource(this,
                R.array.spinnerAmPm, android.R.layout.simple_spinner_item);
        adapterHalf.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMin.setAdapter(adapterHalf);


        btTimeSlot =(Button) findViewById(R.id.btTimeSlot);

        btTimeSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back2home= new Intent(TimeSlot.this,HomePage4Doctor.class);
                TimeSlot.this.startActivity(back2home);
                Toast.makeText(TimeSlot.this, "Slot Added",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
