package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class SetAppointment1 extends AppCompatActivity {

    CalendarView calendarViewD;
    Button btDateDoc;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_appointment1);
        calendarViewD = (CalendarView) findViewById(R.id.calendarViewD);
        btDateDoc =(Button) findViewById(R.id.btDateDoc);

        btDateDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeSlot=new Intent(SetAppointment1.this,TimeSlot.class);
                SetAppointment1.this.startActivity(timeSlot);
            }
        });
    }
}
