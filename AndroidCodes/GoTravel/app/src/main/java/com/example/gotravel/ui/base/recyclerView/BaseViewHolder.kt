package com.example.gotravel.ui.base.recyclerView

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.gotravel.ui.base.BaseListener
import com.example.gotravel.module.IDiff

class BaseViewHolder<
        B: ViewBinding,
        ITEM: IDiff,
        LIS: BaseListener> (val binding: B) : RecyclerView.ViewHolder(binding.root) {
}