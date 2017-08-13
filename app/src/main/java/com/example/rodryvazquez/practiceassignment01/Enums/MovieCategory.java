package com.example.rodryvazquez.practiceassignment01.Enums;

/**
 * Created by RodryVazquez on 08/08/17.
 */

public enum MovieCategory {

    COMEDY("Comedia"),
    TERROR("Terror"),
    ACTION("Accion"),
    ROMANCE("Romance");

    private final String title;

    MovieCategory(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
