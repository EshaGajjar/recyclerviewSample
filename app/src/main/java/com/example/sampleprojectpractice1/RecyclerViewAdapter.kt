package com.example.sampleprojectpractice1

import android.content.Intent
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
        holder.subject.text = model.subject
        holder.standard.text = model.std

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailedActivity::class.java)
            intent.putExtra("name", model.name)
            intent.putExtra("subject", model.subject)
            intent.putExtra("std", model.std)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val standard: TextView
        val subject: TextView

        init {
            name = itemView.findViewById(R.id.name)
            standard = itemView.findViewById(R.id.standard)
            subject = itemView.findViewById(R.id.subject)
        }
    }

}