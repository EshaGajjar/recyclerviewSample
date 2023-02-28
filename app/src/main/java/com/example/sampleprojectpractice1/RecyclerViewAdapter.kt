package com.example.sampleprojectpractice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(val itemList : ArrayList<ModelClass>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: ModelClass = itemList[position]

        holder.name.text = model.name
        holder.image.setImageResource(model.image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val image: ImageView

        init {
            name = itemView.findViewById(R.id.name)
            image = itemView.findViewById(R.id.image)
        }
    }
}