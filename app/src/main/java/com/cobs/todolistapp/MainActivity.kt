package com.cobs.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cobs.todolistapp.data.ToDoAdapter
import com.cobs.todolistapp.data.ToDoModel
import com.cobs.todolistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addButton = binding.addBtn
        addButton.setOnClickListener {
            var intent = Intent(this,CreateActivity::class.java)
            startActivity(intent)
        }

        var list = ArrayList<ToDoModel>()

        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Walk","6:00 AM", "Walk"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))
        list.add(ToDoModel(R.drawable.cobs, "Jog","6:00 AM", "Run 5Kms"))

        val adapter = ToDoAdapter(this,list)

        val recyclerview = binding.recyclerView
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)

    }
}