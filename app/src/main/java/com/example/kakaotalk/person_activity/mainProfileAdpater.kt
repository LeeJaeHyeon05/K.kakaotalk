package com.example.kakaotalk.person_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kakaotalk.R

class mainProfileAdpater(private val mList: ArrayList<mainProfileItems>) : RecyclerView.Adapter<mainProfileAdpater.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mainProfileAdpater.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_profile_item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: mainProfileAdpater.ViewHolder, position: Int) {
        val itemModel = mList[position]

        holder.mImageImg.setImageResource(itemModel.mainImage)
        holder.mNameTxt.setText(itemModel.mainText)
        holder.mDesTxt.setText(itemModel.mainExplain)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val mImageImg: ImageView = itemView.findViewById(R.id.mainProfileImageView)
        val mNameTxt: TextView = itemView.findViewById(R.id.mainProfileTextView)
        val mDesTxt: TextView = itemView.findViewById(R.id.mainProfileDesTextView)
    }

}