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
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter);
    }
}