package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();
        BucketListItem bucketListItem = (BucketListItem) intent.getSerializableExtra("bucketListItem");


        String titleToUse = bucketListItem.getTaskTitle();
        TextView titleTextViewn = findViewById(R.id.descriptionTextView);
        titleTextViewn.setText( titleToUse );

        String blurbToUse = bucketListItem.getBlurb();
        TextView blurbTextView = findViewById(R.id.descriptionBlurbView);
        blurbTextView.setText( blurbToUse );

    }

}
