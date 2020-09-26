package com.example.ments4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class DiseaseFactorsFragment extends Fragment {

    Spinner param1;
    Spinner param2;
    Spinner param3;
    Spinner param4;
    Spinner param5;
    Spinner param6;
    Spinner param7;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_disease_factors, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(com.example.ments4.DiseaseFactorsFragment.this)
                        .navigate(R.id.action_DiF_to_SecondFragment);
            }
        });

        param1 = view.findViewById(R.id.sp01b);
        ArrayAdapter<CharSequence> adapter1b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1b);

        param2 = view.findViewById(R.id.sp02b);
        ArrayAdapter<CharSequence> adapter2b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2b);

        param3 = view.findViewById(R.id.sp03b);
        param4 = view.findViewById(R.id.sp04b);
        param5 = view.findViewById(R.id.sp05b);
        param6 = view.findViewById(R.id.sp06b);
        ArrayAdapter<CharSequence> adapter3b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param3_6, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3b);
        param4.setAdapter(adapter3b);
        param5.setAdapter(adapter3b);
        param6.setAdapter(adapter3b);

    }
}