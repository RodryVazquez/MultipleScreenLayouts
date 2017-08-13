package com.example.rodryvazquez.practiceassignment01.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.rodryvazquez.practiceassignment01.Enums.MovieCategory;

import io.realm.RealmObject;

/**
 * Created by RodryVazquez on 08/08/17.
 */

public class MovieItemModel extends RealmObject implements Parcelable {

    private int movieId;
    private String movieTitle;
    private String movieDescription;
    private String movieCategoryDescription;

    public MovieItemModel() {
    }

    public MovieItemModel(Parcel in) {
        movieId = in.readInt();
        movieTitle = in.readString();
        movieDescription = in.readString();
        movieCategoryDescription = in.readString();
    }

    public static final Creator<MovieItemModel> CREATOR = new Creator<MovieItemModel>() {
        @Override
        public MovieItemModel createFromParcel(Parcel in) {
            return new MovieItemModel(in);
        }

        @Override
        public MovieItemModel[] newArray(int size) {
            return new MovieItemModel[size];
        }
    };

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public MovieCategory getMovieCategoryDescription() {
        return MovieCategory.valueOf(movieCategoryDescription);
    }

    public void setMovieCategoryDescription(MovieCategory movieCategory) {
        this.movieCategoryDescription = movieCategory.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(movieId);
        parcel.writeString(movieTitle);
        parcel.writeString(movieDescription);
        parcel.writeString(movieCategoryDescription);
    }
}
