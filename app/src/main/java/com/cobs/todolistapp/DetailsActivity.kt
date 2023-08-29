package com.cobs.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val image = intent.getIntExtra("image", R.drawable.cobs)
        val title = intent.getStringExtra("todoname")
        val date = intent.getStringExtra("todotime")
        val description = intent.getStringExtra("tododescription")
      //  val status = intent.getSerializableExtra("activityStatus")
        //Log.d("Status", "$status")

        val titleValue = findViewById<TextView>(R.id.textView)
        titleValue.text = title.toString()


        val icon = findViewById<ImageView>(R.id.todo_icon)

        icon.setImageResource(image)

        val dateValue = findViewById<TextView>(R.id.textView2)

        dateValue.text = date.toString()

        val descriptionValue = findViewById<TextView>(R.id.textView3)
        descriptionValue.text = description.toString()

       // val button = findViewById<Button>(R.id.status_button)
      //  button.text = status.toString()

//        intent.putExtra("image", list[position].image)
//        intent.putExtra("todoname", list[position].ToDoName)
//        intent.putExtra("todotime", list[position].ToDoTime)
//        intent.putExtra("tododescription", list[position].ToDoDescription)
    }
}