package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimetableFragment extends Fragment {


    public TimetableFragment() {
        // Required empty public constructor
    }


    TextView tvcomp,tvit,tventc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_timetable, container, false);
        tvcomp = (TextView) view.findViewById(R.id.tvcomp);
        tvit = (TextView) view.findViewById(R.id.tvit);
        tventc = (TextView) view.findViewById(R.id.tventc);


        tvcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimetableFragment.this.getActivity(), Classess.class));
                Toast.makeText(TimetableFragment.this.getActivity(),"Timetables",Toast.LENGTH_SHORT).show();
            }
        });


        tvit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimetableFragment.this.getActivity(), ClassessIt.class));
                Toast.makeText(TimetableFragment.this.getActivity(),"Timetables",Toast.LENGTH_SHORT).show();
            }
        });

        tventc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimetableFragment.this.getActivity(), Classessentc.class));
                Toast.makeText(TimetableFragment.this.getActivity(),"Timetables",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
