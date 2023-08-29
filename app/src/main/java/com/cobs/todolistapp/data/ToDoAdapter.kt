package com.cobs.todolistapp.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.cobs.todolistapp.DetailsActivity
import com.cobs.todolistapp.R

class ToDoAdapter( var context: Context, var list: ArrayList<ToDoModel>):RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.todo_image)
        val todoname = itemView.findViewById<TextView>(R.id.todo_name)
        val todotime = itemView.findViewById<TextView>(R.id.todo_time)
        val tododescription = itemView.findViewById<TextView>(R.id.todo_description)
       // val todostatus = itemView.findViewById<TextView>(R.id.todo_image)
        val card = itemView.findViewById<CardView>(R.id.my_card)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null, false)
        return ToDoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.todoname.text = list[position].ToDoName
        holder.todotime.text = list[position].ToDoTime
        holder.tododescription.text = list[position].ToDoDescription

        holder.card.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("image", list[position].image)
            intent.putExtra("todoname", list[position].ToDoName)
            intent.putExtra("todotime", list[position].ToDoTime)
            intent.putExtra("tododescription", list[position].ToDoDescription)
            context.startActivity(intent)
        }



    }
}