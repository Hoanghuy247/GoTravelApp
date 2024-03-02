package com.example.gotravel.module

//TODO: Every module class should implement this interface to have DiffUtil to compare
interface IDiff {
    fun areItemsTheSame(item : IDiff): Boolean
    fun areContentsTheSame(item : IDiff) : Boolean
}