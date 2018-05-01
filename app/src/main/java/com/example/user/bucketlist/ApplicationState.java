package com.example.user.bucketlist;

import java.util.ArrayList;

public class ApplicationState {

    private ArrayList<BucketListItem> favouriteBucketList;
    private String userName;

    public ApplicationState(String userName){
        this.userName = userName;
        this.favouriteBucketList = new ArrayList<BucketListItem>();
    }

    public ArrayList<BucketListItem> getFavouriteBucketList() {
        return favouriteBucketList;
    }

    public void setFavouriteBucketList(ArrayList<BucketListItem> favouriteBucketList){
        this.favouriteBucketList = favouriteBucketList;
    }
}
