package com.example.iftek.edoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class InterestedPatDoc extends AppCompatActivity {

    int [] IMAGES ={R.drawable.patient1,R.drawable.patient2jpg,R.drawable.patient3};
    String[ ] NAMES={"Patient 1", "Patient 2", "Patient 3"};
    String[] DESCRIPTION={"Description 1","Description 2","Description 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interested_pat_doc);

        ListView lvInterestedPat= (ListView) findViewById(R.id.lvInterestedPat);

        CustomAdapter customAdapter =new CustomAdapter();
        lvInterestedPat.setAdapter(customAdapter);


        ///onClickListener

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
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
            convertView=getLayoutInflater().inflate(R.layout.interestedpatlayout,null);
            ImageView ivIP= (ImageView) convertView.findViewById(R.id.ivIP);
            TextView tvNameIP= (TextView) convertView.findViewById(R.id.tvNameIP);
            TextView tvDescriptionIP= (TextView)convertView.findViewById(R.id.tvDescriptionIP);

            ivIP.setImageResource(IMAGES[position]);
            tvNameIP.setText(NAMES[position]);
            tvDescriptionIP.setText(DESCRIPTION[position]);

            return convertView;
        }
    }


}
