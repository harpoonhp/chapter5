package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("item") private Feed item;
    @SerializedName("success") private boolean success;

    public Feed getitem() {
        return item;
    }
    public void setitem(Feed item) {
        this.item = item;
    }

    public boolean getsuccess() {
        return success;
    }
    public void setsuccess(boolean success) {
        this.success = success;
    }

    @Override public String toString() {
        return "Post{" +
                "item='" + item + '\'' +
                ", success=" + success +
                '}';
    }
}
