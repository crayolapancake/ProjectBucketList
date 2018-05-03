package com.example.user.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;


// HOMESCREEN
public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        BucketList loadedBucketList = SharedPreferencesHelper.loadApplicationState(this);

        if (loadedBucketList.getBucketList() == null) {
            loadedBucketList = new BucketList();
            SharedPreferencesHelper.saveApplicationState(this, loadedBucketList);
        }

        ArrayList<BucketListItem> bucketListCatalogue = loadedBucketList.getBucketList();

        BucketListAdapter bucketListAdapter = new BucketListAdapter(this, bucketListCatalogue);

        ListView bucketListCatalogueView = findViewById(R.id.bucketListListViewId);
        bucketListCatalogueView.setAdapter(bucketListAdapter);



    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView bucketListCatalogueView = findViewById(R.id.bucketListListViewId);
        bucketListCatalogueView.invalidateViews();
    }

    public void onListItemClick(View listItem) {
        BucketListItem bucketListItem = (BucketListItem) listItem.getTag();
        Log.d("Bucketlist Title", bucketListItem.getTaskTitle());

        Intent intent = new Intent(this, FavouritesActivity.class);
        intent.putExtra("bucketListItem", bucketListItem);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //this will get called when the menu item gets clicked
        if (item.getItemId() == R.id.action_add) {
            Intent addIntent = new Intent(this, AddActivity.class);
            startActivity(addIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }





}



