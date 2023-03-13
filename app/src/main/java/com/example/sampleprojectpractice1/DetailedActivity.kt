package com.example.sampleprojectpractice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {

    lateinit var subject : TextView
    lateinit var std : TextView
    lateinit var name : TextView
    lateinit var backBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        subject = findViewById(R.id.subject)
        name = findViewById(R.id.name)
        std = findViewById(R.id.std)
        backBtn = findViewById(R.id.backBtn)

        backBtn.setOnClickListener{
            finish()
        }
        initData()
    }

    private fun initData() {
        val subD = intent.getStringExtra("subject")
        val stdD = intent.getStringExtra("std")
        val nameD = intent.getStringExtra("name")

        name.text = nameD
        std.text = stdD
        subject.text = subD

    }
}