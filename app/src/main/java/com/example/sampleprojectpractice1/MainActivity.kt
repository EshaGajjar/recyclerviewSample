package com.example.sampleprojectpractice1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        initRecyclerView()
    }

    private fun initRecyclerView() {

        val itemList: ArrayList<ModelClass> = ArrayList()
        itemList.add(ModelClass("Alan Smith","10th","Maths"))
        itemList.add(ModelClass("Bon Jones","11th","Science"))
        itemList.add(ModelClass("Carry Chan","12th","Gujarati"))
        itemList.add(ModelClass("Eva Lee","9th","Science"))
        itemList.add(ModelClass("Fanny Roberts","10th","English"))
        itemList.add(ModelClass("Gery Brown","10th","Maths"))

        val adapter = RecyclerViewAdapter(itemList)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }
}