package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

    public void saveButtonClicked(View buttonThatWasClicked){

        EditText titleTextView = findViewById(R.id.addTaskTitleId);
        String taskTitleUserTyped =  titleTextView.getText().toString();

        EditText blurbTextView = findViewById(R.id.addBlurbId);
        String blurbUserTyped = blurbTextView.getText().toString();

        BucketListItem newBLI = new BucketListItem(taskTitleUserTyped, blurbUserTyped);

        BucketList loadedBucketList = SharedPreferencesHelper.loadApplicationState(this);
        loadedBucketList.addTask(newBLI);
        SharedPreferencesHelper.saveApplicationState(this, loadedBucketList);

    }


}
