package com.example.ments4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    final int Prf = 0;
    final int Dif = 0;
    final int Paf = 0;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int Prf = SecondFragmentArgs.fromBundle(getArguments()).getPrFScore();
        final int Dif = SecondFragmentArgs.fromBundle(getArguments()).getDiFScore();
        final int Paf = SecondFragmentArgs.fromBundle(getArguments()).getPaFScore();

        final int[] Suma = {0};

        view.findViewById(R.id.button_PrF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToPrF accion1 = SecondFragmentDirections.actionSecondFragmentToPrF();

                accion1.setPrFTotal(Prf);
                accion1.setDiFTotal(Dif);
                accion1.setPaFTotal(Paf);

                NavHostFragment.findNavController(com.example.ments4.SecondFragment.this).navigate(accion1);
            }
        });

/**
        view.findViewById(R.id.button_PrF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_PrF);
            }
        });
 */
        view.findViewById(R.id.button_DiF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToDiF accion2 = SecondFragmentDirections.actionSecondFragmentToDiF();

                accion2.setPrFTotal(Prf);
                accion2.setDiFTotal(Dif);
                accion2.setPaFTotal(Paf);

                NavHostFragment.findNavController(com.example.ments4.SecondFragment.this).navigate(accion2);
            }
        });

/**
        view.findViewById(R.id.button_DiF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_DiF);
            }
        });
 */
        view.findViewById(R.id.button_PaF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragmentDirections.ActionSecondFragmentToPaF accion3 = SecondFragmentDirections.actionSecondFragmentToPaF();

                accion3.setPrFTotal(Prf);
                accion3.setDiFTotal(Dif);
                accion3.setPaFTotal(Paf);

                NavHostFragment.findNavController(com.example.ments4.SecondFragment.this).navigate(accion3);
            }
        });

/**
        view.findViewById(R.id.button_PaF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_PaF);
            }
        });
 */
        final TextView total = view.findViewById(R.id.Score);
        total.setText(""+ Suma[0]);

        view.findViewById(R.id.calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suma[0] = Prf+Dif+Paf;
                total.setText(""+ Suma[0]);
            }
        });
    }
}