package com.example.ments4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    int Score1;
    int Score2;
    int Score3;
    int Score4;
    int Score5;
    int Score6;
    int Score7;

    int PrFScore;
    int DiFScore;
    int PaFScore;

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

        DiFScore = ProcedureFactorsFragmentArgs.fromBundle(getArguments()).getDiFTotal();
        PaFScore = ProcedureFactorsFragmentArgs.fromBundle(getArguments()).getPaFTotal();

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProcedureFactorsFragmentDirections.ActionPrFToSecondFragment accion1 = ProcedureFactorsFragmentDirections.actionPrFToSecondFragment();
                PrFScore = Score1+Score2+Score3+Score4+Score5+Score6+Score7;
                accion1.setPrFScore(PrFScore);
                accion1.setDiFScore(DiFScore);
                accion1.setPaFScore(PaFScore);

                NavHostFragment.findNavController(com.example.ments4.ProcedureFactorsFragment.this)
                        .navigate(accion1);
            }
        });

        param1 = view.findViewById(R.id.sp01a);
        ArrayAdapter<CharSequence> adapter1a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1a);

        param1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score1 = 1;}
                else if (i == 1){
                    Score1 = 2;}
                else if (i == 2){
                    Score1 = 3;}
                else if (i == 3){
                    Score1 = 4;}
                else if (i == 4){
                    Score1 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param2 = view.findViewById(R.id.sp02a);
        ArrayAdapter<CharSequence> adapter2a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2a);

        param2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score2 = 1;}
                else if (i == 1){
                    Score2 = 2;}
                else if (i == 2){
                    Score2 = 3;}
                else if (i == 3){
                    Score2 = 4;}
                else if (i == 4){
                    Score2 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param3 = view.findViewById(R.id.sp03a);
        ArrayAdapter<CharSequence> adapter3a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param3, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3a);

        param3.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score3 = 1;}
                else if (i == 1){
                    Score3 = 2;}
                else if (i == 2){
                    Score3 = 3;}
                else if (i == 3){
                    Score3 = 4;}
                else if (i == 4){
                    Score3 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param4 = view.findViewById(R.id.sp04a);
        ArrayAdapter<CharSequence> adapter4a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param4, android.R.layout.simple_spinner_item);
        param4.setAdapter(adapter4a);

        param4.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score4 = 1;}
                else if (i == 1){
                    Score4 = 2;}
                else if (i == 2){
                    Score4 = 3;}
                else if (i == 3){
                    Score4 = 4;}
                else if (i == 4){
                    Score4 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param5 = view.findViewById(R.id.sp05a);
        ArrayAdapter<CharSequence> adapter5a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param5, android.R.layout.simple_spinner_item);
        param5.setAdapter(adapter5a);

        param5.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score5 = 1;}
                else if (i == 1){
                    Score5 = 2;}
                else if (i == 2){
                    Score5 = 3;}
                else if (i == 3){
                    Score5 = 4;}
                else if (i == 4){
                    Score5 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param6 = view.findViewById(R.id.sp06a);
        ArrayAdapter<CharSequence> adapter6a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param6, android.R.layout.simple_spinner_item);
        param6.setAdapter(adapter6a);

        param6.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score6 = 1;}
                else if (i == 1){
                    Score6 = 2;}
                else if (i == 2){
                    Score6 = 3;}
                else if (i == 3){
                    Score6 = 4;}
                else if (i == 4){
                    Score6 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param7 = view.findViewById(R.id.sp07a);
        ArrayAdapter<CharSequence> adapter7a = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla1param7, android.R.layout.simple_spinner_item);
        param7.setAdapter(adapter7a);

        param7.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score7 = 1;}
                else if (i == 1){
                    Score7 = 2;}
                else if (i == 2){
                    Score7 = 3;}
                else if (i == 3){
                    Score7 = 4;}
                else if (i == 4){
                    Score7 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}