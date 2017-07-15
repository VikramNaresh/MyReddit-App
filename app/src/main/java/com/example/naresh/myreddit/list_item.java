package com.example.naresh.myreddit;

import android.media.Image;

/**
 * Created by NARESH on 15-07-17.
 */

public class list_item {
    String desc;
    String imgurl;
    int no_comments;

    public list_item(String desc, String imgurl,int no_comments) {
        this.desc = desc;
        this.imgurl = imgurl;
        this.no_comments = no_comments;
    }

    public String getDesc() {
        return desc;
    }

    public String getImgurl() {
        return imgurl;
    }

    public int getNo_comments(){
        return no_comments;
    }
}
