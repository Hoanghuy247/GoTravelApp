package com.example.gotravel.ui.base.recyclerView

import androidx.recyclerview.widget.DiffUtil
import com.example.gotravel.module.IDiff

class BaseDiffCallBack<T : IDiff> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.areItemsTheSame(newItem)
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.areContentsTheSame(newItem)
    }
}