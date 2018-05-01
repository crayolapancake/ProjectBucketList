package com.example.user.bucketlist;

import java.io.Serializable;

public class BucketListItem implements Serializable{

    private String taskTitle;
    public String blurb;

    public BucketListItem(String taskTitle, String blurb){
        this.taskTitle = taskTitle;
        this.blurb = blurb;
    }

    public String getTaskTitle(){
        return this.taskTitle;
    }

    public String getBlurb() {
        return this.blurb;
    }

//    public void setTaskTitle(String taskTitle) {
//        this.taskTitle = taskTitle;
//    }
//
//    public void setBlurb(String blurb) {
//        this.blurb = blurb;
//    }

}
