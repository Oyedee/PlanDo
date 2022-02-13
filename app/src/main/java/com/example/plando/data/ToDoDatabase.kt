package com.example.plando.data

import androidx.room.Database
import com.example.plando.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {
    abstract fun toDoDao(): ToDoDao
}