package com.example.rodryvazquez.practiceassignment01.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.rodryvazquez.practiceassignment01.Adapters.GeneralListAdapter;
import com.example.rodryvazquez.practiceassignment01.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RodryVazquez on 08/08/17.
 */

public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, null);
        setupRecyclerView(view);
        return view;
    }

    public void setupRecyclerView(View view) {
        RecyclerView recyclerView =  view.findViewById(R.id.rcv_list);
        GeneralListAdapter generalListAdapter = new GeneralListAdapter(getActivity(), dataItems());

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(generalListAdapter);
    }

    public static ArrayList<String> dataItems(){
        ArrayList<String> test = new ArrayList<String>();
        test.add("Tango & Cash");
        test.add("IT");
        test.add("The Mommy");
        test.add("Simple Love");
        test.add("Simple Love 2");
        test.add("Angels and Demons");
        test.add("Life Bad");
        test.add("Back to the future");
        return  test;
    }
}
