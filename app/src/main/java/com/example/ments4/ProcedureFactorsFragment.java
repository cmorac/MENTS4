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

public class ProcedureFactorsFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_procedure_factors, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(com.example.ments4.ProcedureFactorsFragment.this)
                        .navigate(R.id.action_PrF_to_SecondFragment);
            }
        });

        param1 = view.findViewById(R.id.sp01a);
        ArrayAdapter<CharSequence> adapter1a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1a);

        param2 = view.findViewById(R.id.sp02a);
        ArrayAdapter<CharSequence> adapter2a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2a);

        param3 = view.findViewById(R.id.sp03a);
        ArrayAdapter<CharSequence> adapter3a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param3, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3a);

        param4 = view.findViewById(R.id.sp04a);
        ArrayAdapter<CharSequence> adapter4a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param4, android.R.layout.simple_spinner_item);
        param4.setAdapter(adapter4a);

        param5 = view.findViewById(R.id.sp05a);
        ArrayAdapter<CharSequence> adapter5a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param5, android.R.layout.simple_spinner_item);
        param5.setAdapter(adapter5a);

        param6 = view.findViewById(R.id.sp06a);
        ArrayAdapter<CharSequence> adapter6a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param6, android.R.layout.simple_spinner_item);
        param6.setAdapter(adapter6a);

        param7 = view.findViewById(R.id.sp07a);
        ArrayAdapter<CharSequence> adapter7a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param7, android.R.layout.simple_spinner_item);
        param7.setAdapter(adapter7a);

    }
}