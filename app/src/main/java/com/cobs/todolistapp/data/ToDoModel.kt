package com.cobs.todolistapp.data

data class ToDoModel(
    val image:Int = 1,
    var ToDoName:String = "",
    var ToDoTime: String,
    var ToDoDescription: String = "",
   // var ToDoStatus: ToDoStatus = com.cobs.todolistapp.data.ToDoStatus.Pending
)
