package com.example.rodryvazquez.practiceassignment01;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by RodryVazquez on 08/08/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .schemaVersion(0)
                .name("myRealmDatabase.realm")
                .build();
        Realm.setDefaultConfiguration(configuration);
    }
}
