package com.matin.task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.matin.task.databinding.FeedItemBinding
import com.matin.task.model.Docs
import com.matin.task.model.Media

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

    inner class FeedHolder(private val view: FeedItemBinding): RecyclerView.ViewHolder(view.root) {
        fun bind(feed: Docs) {
            view.apply {
                author.text = feed.author?.name ?: ""
                answer.text = feed.ownerAnswer
                voteCount.text = feed.likesCount.toString()
                commentCount.text = feed.commentCount.toString()
                manufactureType.text = feed.manuType
                manufacture.text = feed.manufacturer?.name ?: ""
                val pictureArrayList = getPictures(feed.media)
                if (pictureArrayList.size >= 1) {
                    Glide
                        .with(this.root.context)
                        .load(pictureArrayList[0].url)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .into(picture)
                } else {
                    picture.visibility = View.GONE
                }
                if (feed.manufacturer?.isPartner == true) {
                    verified.visibility = View.VISIBLE
                }
                vote.setOnClickListener { showDialog("vote") }
                comment.setOnClickListener { showDialog("comment") }
                share.setOnClickListener { showDialog("share") }
                more.setOnClickListener { showDialog("more") }
            }
        }

        private fun showDialog(s: String) {
            val dialogBuilder = AlertDialog.Builder(view.root.context)
            val message = "You've clicked on \"$s\""
            dialogBuilder.setTitle("Inform")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .create()
                .show()
        }

        private fun getPictures(media: ArrayList<Media>): ArrayList<Media> {
            val filterList: ArrayList<Media> = ArrayList()
            for (medium in media) {
                if (medium.mediaType.equals("picture")) {
                    filterList.add(medium)
                }
            }
            return filterList
        }
    }



}