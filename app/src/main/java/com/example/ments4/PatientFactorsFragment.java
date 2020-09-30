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

public class PatientFactorsFragment extends Fragment {

    Spinner param1;
    Spinner param2;
    Spinner param3;
    Spinner param4;
    Spinner param5;
    Spinner param6;
    Spinner param7;
    Spinner param8;
    int Score1;
    int Score2;
    int Score3;
    int Score4;
    int Score5;
    int Score6;
    int Score7;
    int Score8;

    int PaFScore;
    int PrFScore;
    int DiFScore;

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

        PrFScore = PatientFactorsFragmentArgs.fromBundle(getArguments()).getPrFTotal();
        DiFScore = PatientFactorsFragmentArgs.fromBundle(getArguments()).getDiFTotal();

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PatientFactorsFragmentDirections.ActionPaFToSecondFragment accion3 = PatientFactorsFragmentDirections.actionPaFToSecondFragment();
                PaFScore = Score1+Score2+Score3+Score4+Score5+Score6+Score7+Score8;
                accion3.setPaFScore(PaFScore);
                accion3.setPrFScore(PrFScore);
                accion3.setDiFScore(DiFScore);

                NavHostFragment.findNavController(com.example.ments4.PatientFactorsFragment.this)
                        .navigate(accion3);
            }
        });

        param1 = view.findViewById(R.id.sp01c);
        ArrayAdapter<CharSequence> adapter1c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1c);

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

        param2 = view.findViewById(R.id.sp02c);
        ArrayAdapter<CharSequence> adapter2c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2c);

        param2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score2 = 1;}
                else if (i == 1){
                    Score2 = 4;}
                else if (i == 2){
                    Score2 = 5;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param3 = view.findViewById(R.id.sp03c);
        ArrayAdapter<CharSequence> adapter3c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param3, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3c);

        param3.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score3 = 1;}
                else if (i == 1){
                    Score3 = 4;}
                else if (i == 2){
                    Score3 = 5;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param4 = view.findViewById(R.id.sp04c);
        ArrayAdapter<CharSequence> adapter4c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param4, android.R.layout.simple_spinner_item);
        param4.setAdapter(adapter4c);

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

        param5 = view.findViewById(R.id.sp05c);
        ArrayAdapter<CharSequence> adapter5c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param5, android.R.layout.simple_spinner_item);
        param5.setAdapter(adapter5c);

        param5.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score5 = 1;}
                else if (i == 1){
                    Score5 = 3;}
                else if (i == 2){
                    Score5 = 4;}
                else if (i == 3){
                    Score5 = 5;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param6 = view.findViewById(R.id.sp06c);
        ArrayAdapter<CharSequence> adapter6c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param6, android.R.layout.simple_spinner_item);
        param6.setAdapter(adapter6c);

        param6.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score6 = 1;}
                else if (i == 1){
                    Score6 = 4;}
                else if (i == 2){
                    Score6 = 5;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param7 = view.findViewById(R.id.sp07c);
        ArrayAdapter<CharSequence> adapter7c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param7, android.R.layout.simple_spinner_item);
        param7.setAdapter(adapter7c);

        param7.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score7 = 1;}
                else if (i == 1){
                    Score7 = 5;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        param8 = view.findViewById(R.id.sp08c);
        ArrayAdapter<CharSequence> adapter8c = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla3param8, android.R.layout.simple_spinner_item);
        param8.setAdapter(adapter8c);

        param8.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Score8 = 1;}
                else if (i == 1){
                    Score8 = 2;}
                else if (i == 2){
                    Score8 = 3;}
                else if (i == 3){
                    Score8 = 4;}
                else if (i == 4){
                    Score8 = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}