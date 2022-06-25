package com.yawlle.androiddev.Model.Children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Children {
    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData(){
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Children{" +
                "data=" + data +
                '}';
    }
}
