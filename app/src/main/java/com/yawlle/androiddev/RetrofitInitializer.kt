package com.yawlle.androiddev

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitInitializer {
    //json especifico da pagina /r/androiddev
    @GET(".json?raw_json=1")
    fun getReddit() : Call<Reddit>

    companion object {

        var url = "https://www.reddit.com/r/androiddev/"

        fun create() : RetrofitInitializer {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build()
            return retrofit.create(RetrofitInitializer::class.java)

        }
    }
}