package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();
        BucketListItem descriptionOfItem = (BucketListItem) intent.getSerializableExtra("description");

        BucketList loadedBucketList = SharedPreferencesHelper.loadApplicationState(this);

        applicationState.getListDescription().add(descriptionOfItem);
        SharedPreferencesHelper.saveApplicationState(this, applicationState);

//        ArrayList<String> bucketListNames = new ArrayList<>();
//
//        for (BucketListItem bucketListItem : applicationState.getFavouriteBucketList()){
//            String taskTitle = bucketListItem.getTaskTitle();
//            bucketListNames.add(taskTitle);
//        }
//
//        ArrayAdapter<String> bucketListNamesArrayAdapter = new ArrayAdapter<String>(this, R.layout.bucket_list_textview, bucketListNames);
//
//        ListView bucketListNamesListView = findViewById(R.id.bucketListItemizedViewId);
//        bucketListNamesListView.setAdapter(bucketListNamesArrayAdapter);
//

    }
}
