package com.example.restorant_application;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class PastaFragment extends ListFragment {


    public PastaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String [] pizaas ={"pasta 1 ", "pasta 2 ", "pasta 3 "};
        ArrayAdapter arrayAdapter = new ArrayAdapter(inflater.getContext(), android.R.layout.simple_list_item_1 , pizaas);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater , container , savedInstanceState);


    }
}