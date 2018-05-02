package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        Intent intent = getIntent();
        BucketListItem bucketListItem = (BucketListItem) intent.getSerializableExtra("bucketListItem");


//        ApplicationState applicationState = SharedPreferencesHelper.loadApplicationState(this);
//
//        if (applicationState.addToBucketList() == null){
//            applicationState = new ApplicationState();
//            SharedPreferencesHelper.saveApplicationState(this, applicationState);
//        }

    }
}
