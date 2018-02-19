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
public class LabmanualsFragment extends Fragment {


    public LabmanualsFragment() {
        // Required empty public constructor
    }

    TextView tvcslm,tvitlm,tventclm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_labmanuals, container, false);
        tvcslm=(TextView)view.findViewById(R.id.tvcslm);
        tvitlm=(TextView)view.findViewById(R.id.tvitlm);
        tventclm=(TextView)view.findViewById(R.id.tventclm);

        tvcslm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabmanualsFragment.this.getActivity(), ClassesLabmanual.class));
                Toast.makeText(LabmanualsFragment.this.getActivity(),"LabManuals",Toast.LENGTH_SHORT).show();
            }
        });
        tvitlm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabmanualsFragment.this.getActivity(), ClassesLabmanual.class));
                Toast.makeText(LabmanualsFragment.this.getActivity(),"LabManuals",Toast.LENGTH_SHORT).show();
            }
        });
        tventclm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabmanualsFragment.this.getActivity(), ClassesLabmanual.class));
                Toast.makeText(LabmanualsFragment.this.getActivity(),"LabManuals",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
