package com.example.iftek.edoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DoctorList extends AppCompatActivity {

    int [] IMAGESD ={R.drawable.patient1,R.drawable.patient2jpg,R.drawable.patient3};
    String[ ] NAMESD={"Doctor 1", "Doctor 2", "Doctor 3"};
    String[] DESCRIPTIOND={"Description 1","Description 2","Description 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        ListView lvAvailableDoctors= (ListView) findViewById(R.id.lvAvailableDoctors);


        CustomAdapterD customAdapterD= new CustomAdapterD();
        lvAvailableDoctors.setAdapter(customAdapterD);

        lvAvailableDoctors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent bookDoc= new Intent(view.getContext(),Doc1Book.class);
                startActivityForResult(bookDoc, position);
               // if(position==1){

               // }

            }
        });

    }

    class CustomAdapterD extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGESD.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.customlayoutd,null);
            ImageView ivDoctors= (ImageView) convertView.findViewById(R.id.ivDoctors);
            TextView tvNameDocN=(TextView) convertView.findViewById(R.id.tvNameDocN);
            TextView tvDocDescription= (TextView)convertView.findViewById(R.id.tvDocDescription);

            ivDoctors.setImageResource(IMAGESD[position]);
            tvNameDocN.setText(NAMESD[position]);
            tvDocDescription.setText(DESCRIPTIOND[position]);

            return convertView;
        }
    }




}
