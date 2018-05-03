package com.example.user.bucketlist;

import java.util.ArrayList;

public class BucketList {

    private ArrayList<BucketListItem> bucketList;

    public BucketList() {
        bucketList = new ArrayList<BucketListItem>();
        bucketList.add(new BucketListItem ("Skydive", "Jump out of a plane"));
        bucketList.add(new BucketListItem("Bungy Jump", "Throw yourself off a bridge"));
        bucketList.add(new BucketListItem("Swim with Sharks", "Don't get eaten"));
        bucketList.add(new BucketListItem("Learn to shoot", "Prepare for the Zombie Apocalypse"));

    }

    public ArrayList<BucketListItem> getBucketList() {
        return new ArrayList<BucketListItem>(bucketList);
    }



    // add a new BucketList from an Activity page
    public void addTask(BucketListItem bucketListItemToAdd) {
        bucketList.add(bucketListItemToAdd);
    }


    // generic remove method? should remove by index?
    public void removeBucketList(BucketListItem bucketListTaskToRemove){
        this.bucketList.remove(bucketListTaskToRemove);
    }


}

