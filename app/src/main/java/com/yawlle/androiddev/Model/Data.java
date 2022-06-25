package com.yawlle.androiddev.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.yawlle.androiddev.Model.Children.Children;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data {
    @SerializedName("children")
    @Expose
    private ArrayList<Children> children;

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Data{" +
                "children=" + children +
                '}';
    }

}
