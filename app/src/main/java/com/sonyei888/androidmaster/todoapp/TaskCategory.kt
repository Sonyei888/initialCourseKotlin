package com.sonyei888.androidmaster.todoapp

sealed class TaskCategory {
    object Personal:TaskCategory()
    object  Business:TaskCategory()
    object  Other:TaskCategory()
}