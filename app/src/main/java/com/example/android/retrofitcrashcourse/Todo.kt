package com.example.android.retrofitcrashcourse

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)