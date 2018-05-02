package com.example.user.bucketlist;

import java.util.ArrayList;

public class ApplicationState {

    private ArrayList<BucketListItem> favouriteBucketList;

    public ApplicationState(){
        this.favouriteBucketList = new ArrayList<BucketListItem>();
    }

    public ArrayList<BucketListItem> getFavouriteBucketList() {
        return favouriteBucketList;
    }

    public void setFavouriteBucketList(ArrayList<BucketListItem> favouriteBucketList){
        this.favouriteBucketList = favouriteBucketList;
    }
}
