package com.example.rodryvazquez.practiceassignment01.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rodryvazquez.practiceassignment01.Fragments.DetailFragment;
import com.example.rodryvazquez.practiceassignment01.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String movieTitle = getIntent().getStringExtra("movieTitle");
        FragmentManager fragmentManager = getSupportFragmentManager();
        DetailFragment detailFragment = (DetailFragment)fragmentManager.findFragmentById(R.id.fragment_details);
        detailFragment.displayMovieTitle(movieTitle);
    }
}
