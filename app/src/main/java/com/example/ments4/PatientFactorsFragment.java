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

public class PatientFactorsFragment extends Fragment {

    Spinner param1;
    Spinner param2;
    Spinner param3;
    Spinner param4;
    Spinner param5;
    Spinner param6;
    Spinner param7;
    Spinner param8;
    int i = 1;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient_factors, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(com.example.ments4.PatientFactorsFragment.this)
                        .navigate(R.id.action_PaF_to_SecondFragment);
            }
        });

        param1 = view.findViewById(R.id.sp01c);
        ArrayAdapter<CharSequence> adapter1c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1c);

        param2 = view.findViewById(R.id.sp02c);
        ArrayAdapter<CharSequence> adapter2c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2c);

        param3 = view.findViewById(R.id.sp03c);
        ArrayAdapter<CharSequence> adapter3c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param3, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3c);

        param4 = view.findViewById(R.id.sp04c);
        ArrayAdapter<CharSequence> adapter4c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param4, android.R.layout.simple_spinner_item);
        param4.setAdapter(adapter4c);

        param5 = view.findViewById(R.id.sp05c);
        ArrayAdapter<CharSequence> adapter5c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param5, android.R.layout.simple_spinner_item);
        param5.setAdapter(adapter5c);

        param6 = view.findViewById(R.id.sp06c);
        ArrayAdapter<CharSequence> adapter6c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param6, android.R.layout.simple_spinner_item);
        param6.setAdapter(adapter6c);

        param7 = view.findViewById(R.id.sp07c);
        ArrayAdapter<CharSequence> adapter7c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param7, android.R.layout.simple_spinner_item);
        param7.setAdapter(adapter7c);

        param8 = view.findViewById(R.id.sp08c);
        ArrayAdapter<CharSequence> adapter8c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param8, android.R.layout.simple_spinner_item);
        param8.setAdapter(adapter8c);
    }
}