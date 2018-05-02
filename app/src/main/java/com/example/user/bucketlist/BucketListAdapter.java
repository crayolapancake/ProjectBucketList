package com.example.user.bucketlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BucketListAdapter extends ArrayAdapter<BucketListItem> {

    public BucketListAdapter(Context context, ArrayList<BucketListItem> bucketListItems) {
        super(context, 0, bucketListItems);
    }

        //creates the view for list
    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.bucket_list_itemized_view, parent, false);
        }

        BucketListItem currentBucketList = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.taskTitleTextViewId);
        titleTextView.setText(currentBucketList.getTaskTitle());

        TextView yearTextView = listItemView.findViewById(R.id.blurbTextViewId);
        yearTextView.setText(currentBucketList.getBlurb().toString());

        listItemView.setTag(currentBucketList);

        return listItemView;

    }


    }
