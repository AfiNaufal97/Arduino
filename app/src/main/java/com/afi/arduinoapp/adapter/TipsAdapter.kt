package com.afi.arduinoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afi.arduinoapp.databinding.ListTipsBinding
import com.afi.arduinoapp.model.Tips
import com.bumptech.glide.Glide
import java.util.ArrayList

class TipsAdapter(private val listTips : ArrayList<Tips>,
                  val listener : onTipsClick): RecyclerView.Adapter<TipsAdapter.TipsViewHolder>() {

    inner class TipsViewHolder(val binding : ListTipsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipsViewHolder {
        return TipsViewHolder(ListTipsBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: TipsViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listTips[position].image)
                .into(holder.binding.Thumbnail)

            tvHeadlines.text = listTips[position].title
            tvDescription.text = listTips[position].content
        }

        holder.itemView.setOnClickListener {
            listener.onTipsClickListener(listTips[position])
        }
    }

    override fun getItemCount(): Int {
        return listTips.size
    }

    interface onTipsClick{
        fun onTipsClickListener(tips: Tips)
    }
}