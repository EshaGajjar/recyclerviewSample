package com.example.sampleprojectpractice1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
        itemList.add(ModelClass("Android Developer Things", R.drawable.imglogo))
        itemList.add(ModelClass("Android Studio", R.drawable.ic_android_studio))
        itemList.add(ModelClass("Visual Studio Code", R.drawable.ic_vscode))
        itemList.add(ModelClass("GitHub", R.drawable.ic_github))
        itemList.add(ModelClass("Android Studio Duplicate", R.drawable.ic_android_studio))

        val adapter = RecyclerViewAdapter(itemList)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }
}