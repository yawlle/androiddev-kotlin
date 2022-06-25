package com.yawlle.androiddev

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(private val Items: List<Title>,
                          private val context:Context): RecyclerView.Adapter<adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = Items[position]
        holder?.let {
            it.bindView(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.caixinha_title, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(item: Title) {
            val title = itemView.findViewById<TextView>(R.id.tvTitle)
            title.text = item.title
        }

    }
}
