package com.example.rodryvazquez.practiceassignment01.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodryvazquez.practiceassignment01.R;

/**
 * Created by RodryVazquez on 09/08/17.
 */

public class DetailFragment extends Fragment {

    private TextView mMovieTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail,null);
        mMovieTitle = view.findViewById(R.id.tv_movie_title_detail);
        return view;
    }

    public void displayMovieTitle(String movieTitle){
        mMovieTitle.setText(movieTitle);
    }
}
