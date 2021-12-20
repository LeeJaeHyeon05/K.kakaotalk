package com.example.kakaotalk.person_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kakaotalk.R

class profileAdapter(private val mList: ArrayList<profileItems>) : RecyclerView.Adapter<profileAdapter.ViewHoler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): profileAdapter.ViewHoler {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.profil_item_list, parent, false)
        return  ViewHoler(view)
    }

    override fun onBindViewHolder(holder: profileAdapter.ViewHoler, position: Int) {
        val itemModel = mList[position]

        holder.imageButton.setImageResource(itemModel.upDateImage)
        holder.textView.setText(itemModel.upDateText)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHoler(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageButton: ImageButton = itemView.findViewById(R.id.rv_button)
        val textView: TextView = itemView.findViewById(R.id.rv_textView)
    }


}