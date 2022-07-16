package com.matin.task.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matin.task.databinding.FeedItemBinding
import com.matin.task.model.Docs

class FeedAdapter(private val feeds: ArrayList<Docs>): RecyclerView.Adapter<FeedAdapter.FeedHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedHolder {
        return FeedHolder(FeedItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: FeedHolder, position: Int) {
        return holder.bind(feeds[position])
    }

    override fun getItemCount() = feeds.size

    inner class FeedHolder(val view: FeedItemBinding): RecyclerView.ViewHolder(view.root) {
        fun bind(feed: Docs) {
            view.apply {

            }
        }
    }

}