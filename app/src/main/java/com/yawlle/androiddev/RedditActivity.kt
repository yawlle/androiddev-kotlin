package com.yawlle.androiddev

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RedditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reddit)

        val actionbar = supportActionBar
        actionbar!!.title = "r/androiddev"
        actionbar.setDisplayHomeAsUpEnabled(true)

        onReddit()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun onReddit() {
        val retrofitInitializer = RetrofitInitializer.create().getReddit()

        retrofitInitializer.enqueue(object : Callback<Reddit> {
            override fun onResponse(call: Call<Reddit>?, response: Response<Reddit>?) {
                if(response?.body() != null) {
                    val body = response?.body()?.data?.children
                    var listaTitulo:ArrayList<Title> = ArrayList()
                    for ((index, item) in body!!.withIndex()) {
                        var novoTitulo = Title(item.data.title)
                        listaTitulo.add(novoTitulo)
                    }

                    val rView = findViewById<RecyclerView>(R.id.recyclerView)
                    rView.adapter = adapter(listaTitulo, this@RedditActivity)
                    val layoutManager = LinearLayoutManager(this@RedditActivity)
                    rView.layoutManager = layoutManager

                }
            }

            override fun onFailure(call: Call<Reddit>?, t: Throwable?) {
                t?.printStackTrace()
                Toast.makeText(applicationContext, "Algo deu errado!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}