package com.example.rodryvazquez.practiceassignment01;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rodryvazquez.practiceassignment01.Activities.DetailActivity;
import com.example.rodryvazquez.practiceassignment01.Fragments.DetailFragment;
import com.example.rodryvazquez.practiceassignment01.Interfaces.FragmentCommunicator;

public class MainActivity extends AppCompatActivity implements FragmentCommunicator {

    boolean isDisplayInTablet = false;
    DetailFragment detailFragment;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        //Obtenemos la instancia del fragmento
        FragmentManager fragmentManager = getSupportFragmentManager();
        detailFragment = (DetailFragment) fragmentManager.findFragmentById(R.id.fragment_details);
        //Determinamos si nos encontramos en tablet o no
        //View fragmentView = findViewById(R.id.fragment_details);
        //isDisplayInTablet = fragmentView != null && fragmentView.getVisibility() == View.VISIBLE;
        isDisplayInTablet = getResources().getBoolean(R.bool.is_table_mode);
    }

    /**
     *
     * @param title
     * @param description
     */
    @Override
    public void displayMovieDetails(String title, String description) {
        if(isDisplayInTablet){
            detailFragment.displayMovieTitle(title);
        }else{
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("movieTitle",title);
            startActivity(intent);
        }
    }
}
