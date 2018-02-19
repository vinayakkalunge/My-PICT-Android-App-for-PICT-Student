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
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    TextView tvcollege,tvcomp,tvit,tventc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        tvcollege=(TextView)view.findViewById(R.id.tvcollege);
        tvcomp = (TextView) view.findViewById(R.id.tvcsvm);
        tvit = (TextView) view.findViewById(R.id.tvitvm);
        tventc = (TextView) view.findViewById(R.id.tventcvm);

        tvcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutFragment.this.getActivity(), collegevm.class));
                Toast.makeText(AboutFragment.this.getActivity(),"Vision And Mision",Toast.LENGTH_SHORT).show();
            }
        });

        tvcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutFragment.this.getActivity(), compvm.class));
                Toast.makeText(AboutFragment.this.getActivity(),"Vision And Mision",Toast.LENGTH_SHORT).show();
            }
        });


        tvit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutFragment.this.getActivity(), itvm.class));
                Toast.makeText(AboutFragment.this.getActivity(),"Vision And Mision",Toast.LENGTH_SHORT).show();
            }
        });

        tventc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutFragment.this.getActivity(), entcvm.class));
                Toast.makeText(AboutFragment.this.getActivity(),"Vision And Mision",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
