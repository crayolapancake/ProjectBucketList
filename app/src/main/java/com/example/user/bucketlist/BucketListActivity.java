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
import android.widget.ListView;

import java.util.ArrayList;

public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        ApplicationState applicationState = SharedPreferencesHelper.loadApplicationState(this);

        if (applicationState.getFavouriteBucketList() == null){
            applicationState = new ApplicationState();
            SharedPreferencesHelper.saveApplicationState(this, applicationState);
        }

        BucketList bucketList = new BucketList();
        ArrayList<BucketListItem> bucketListCatalogue = bucketList.getBucketList();

        BucketListAdapter bucketListAdapter = new BucketListAdapter(this, bucketListCatalogue);

        ListView  bucketListCatalogueView = findViewById(R.id.bucketListListViewId);
        bucketListCatalogueView.setAdapter(bucketListAdapter);
    }

    public void onListItemClick(View listItem){
        BucketListItem bucketListItem = (BucketListItem) listItem.getTag();
        Log.d("Bucketlist Title", bucketListItem.getTaskTitle());

        Intent intent = new Intent (this, FavouritesActivity.class);
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
        if (item.getItemId() == R.id.action_add) {
            // TODO: create a new task
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
