package com.yawlle.androiddev

import com.google.gson.annotations.SerializedName
import com.yawlle.androiddev.Model.Data


data class Reddit(@SerializedName("kind") var kind:String, @SerializedName("data") var data: Data)