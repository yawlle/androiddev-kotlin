package com.yawlle.androiddev.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reddit {
    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    // toString()
    @Override
    public String toString() {
        return "Feed{" +
                "data=" + data +
                '}';
    }

}
