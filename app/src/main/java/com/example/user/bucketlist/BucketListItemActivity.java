package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

// PARENT
public class BucketListItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list_item);

        Intent intent = getIntent();
        BucketListItem bucketListItem = (BucketListItem) intent.getSerializableExtra("bucketListItem");

        TextView bucketListTitleTextView = findViewById(R.id.bucketListTitleTextViewId);
        bucketListTitleTextView.setText(bucketListItem.getTaskTitle());
    }


}
