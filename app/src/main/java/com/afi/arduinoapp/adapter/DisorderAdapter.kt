package com.afi.arduinoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afi.arduinoapp.databinding.ListDisorderBinding
import com.afi.arduinoapp.model.Disorder
import com.bumptech.glide.Glide
import java.util.ArrayList

class DisorderAdapter(private val listDisorded : ArrayList<Disorder>,
                      val listener : DisorderAdapter.onDisorderClick): RecyclerView.Adapter<DisorderAdapter.DisorderViewHolder>()
{

    inner class DisorderViewHolder(val binding: ListDisorderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisorderViewHolder {
        return DisorderViewHolder(
            ListDisorderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DisorderViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listDisorded[position].image)
                .into(holder.binding.Thumbnail)

            tvHeadlines.text = listDisorded[position].title
            tvDescription.text = listDisorded[position].content
        }

        holder.itemView.setOnClickListener {
            listener.onDisorderClickListener(listDisorded[position])
        }
    }

    override fun getItemCount(): Int {
        return listDisorded.size
    }

    interface onDisorderClick {
        fun onDisorderClickListener(disorder: Disorder)
    }
}