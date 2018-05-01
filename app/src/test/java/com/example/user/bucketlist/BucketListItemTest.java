package com.example.user.bucketlist;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

import static junit.framework.Assert.assertEquals;

public class BucketListItemTest {

    BucketListItem bucketList;

    @Before
    public void before(){
        bucketList = new BucketListItem("Skydive", "Jump out of a plane");
    }

    @Test
    public void getTaskTitleTest(){
        assertEquals("Skydive", bucketList.getTaskTitle());
    }

    @Test
    public void getBlurbTest(){
        assertEquals("Jump out of a plane", bucketList.getBlurb());
    }

}
