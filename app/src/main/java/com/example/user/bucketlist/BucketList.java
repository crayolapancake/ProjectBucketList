package com.example.user.bucketlist;

import java.util.ArrayList;

public class BucketList {

    private ArrayList<BucketListItem> bucketList;

    public BucketList() {
        bucketList = new ArrayList<BucketListItem>();
        bucketList.add(new BucketListItem ("Skydive", "Jump out of a plane"));
        bucketList.add(new BucketListItem("Bungy Jump", "Jump off a bridge"));

    }

    public ArrayList<BucketListItem> getBucketList() {
        return new ArrayList<BucketListItem>(bucketList);
    }



    // add a new BucketList from an Activity page
    public void addTask(BucketListItem bucketListItemToAdd) {
        bucketList.add(bucketListItemToAdd);
    }


    // generic remove method? should remove by index?
    public void removeBucketList(BucketListItem list){
        this.bucketList.remove(bucketList);
    }


}

