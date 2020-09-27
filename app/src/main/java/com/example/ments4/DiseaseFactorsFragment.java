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

public class DiseaseFactorsFragment extends Fragment {

    Spinner param1;
    Spinner param2;
    Spinner param3;
    Spinner param4;
    Spinner param5;
    Spinner param6;
    int Score1;
    int Score2;
    int Score3;
    int Score4;
    int Score5;
    int Score6;

    int DiFScore;

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

                DiseaseFactorsFragmentDirections.ActionDiFToSecondFragment accion2 = DiseaseFactorsFragmentDirections.actionDiFToSecondFragment();
                DiFScore = Score1+Score2+Score3+Score4+Score5+Score6;
                accion2.setPrFScore(DiFScore);

                NavHostFragment.findNavController(com.example.ments4.DiseaseFactorsFragment.this)
                        .navigate(accion2);
            }
        });

        param1 = view.findViewById(R.id.sp01b);
        ArrayAdapter<CharSequence> adapter1b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param1, android.R.layout.simple_spinner_item);
        param1.setAdapter(adapter1b);

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

        param2 = view.findViewById(R.id.sp02b);
        ArrayAdapter<CharSequence> adapter2b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param2, android.R.layout.simple_spinner_item);
        param2.setAdapter(adapter2b);

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

        param3 = view.findViewById(R.id.sp03b);
        param4 = view.findViewById(R.id.sp04b);
        param5 = view.findViewById(R.id.sp05b);
        param6 = view.findViewById(R.id.sp06b);
        ArrayAdapter<CharSequence> adapter3b = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.Tabla2param3_6, android.R.layout.simple_spinner_item);
        param3.setAdapter(adapter3b);
        param4.setAdapter(adapter3b);
        param5.setAdapter(adapter3b);
        param6.setAdapter(adapter3b);

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

    }
}