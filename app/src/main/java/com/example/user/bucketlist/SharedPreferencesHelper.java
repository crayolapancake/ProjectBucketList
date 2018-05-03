package com.example.user.bucketlist;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;


public class SharedPreferencesHelper {

    public static void saveApplicationState(Context context, BucketList bucketListToSave){

        SharedPreferences.Editor editor = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE).edit();

        Gson gson = new Gson();
        String json = gson.toJson(bucketListToSave);
        editor.putString("APPLICATION_STATE", json);
        editor.apply();
    }

    public static BucketList loadApplicationState(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
        Gson gson = new Gson();
        BucketList loadedBucketList = gson.fromJson(sharedPreferences.getString("APPLICATION_STATE", "{}"), BucketList.class );
        return loadedBucketList;
    }
}

