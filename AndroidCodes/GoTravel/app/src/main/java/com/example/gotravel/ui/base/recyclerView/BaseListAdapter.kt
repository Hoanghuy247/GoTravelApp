package com.example.gotravel.ui.base.recyclerView

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
import com.example.gotravel.module.IDiff
import com.example.gotravel.ui.base.BaseData
import com.example.gotravel.ui.base.BaseListener
import java.lang.Exception

abstract class BaseListAdapter<
        ITEM: IDiff,
        LIS: BaseListener,
        DATA: BaseData<ITEM>>() :
    ListAdapter<ITEM, BaseViewHolder<ViewBinding, ITEM, LIS>>(BaseDiffCallBack<ITEM>()){

    protected var data: DATA? = null
        private set

    var listener: LIS? = null
        private set

    /**
    - Every adapter has a OnDataChangeLister to lister data change and update everytime
    - submitList will submit changed list data to update
     */
    private val onDataChangeLister = object  : BaseData.OnDataChangeLister {
        override fun onDataChange() {
            submitList(data?.getAllData())
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ViewBinding, ITEM, LIS> {
        return BaseViewHolder(getItemBinding(parent, viewType))
    }

    //TODO: To create different type of ViewHolder
    abstract fun getItemBinding(parent: ViewGroup, viewType: Int): ViewBinding


    override fun onBindViewHolder(holder: BaseViewHolder<ViewBinding, ITEM, LIS>, position: Int) {
        try {
            getItemPosition(position)?.let{ bindView(holder, position, it, listener)}
        } catch (e: Exception){
            Log.e("TAG", "onBindViewHolder: error $position - $e", )
        }
    }

    open fun getItemPosition(position: Int): ITEM? {
        return data?.getItemAtPosition(position)
    }

    abstract fun bindView(
        holder: BaseViewHolder<ViewBinding, ITEM, LIS>,
        position: Int,
        item: ITEM,
        lis: LIS?
    )

    fun notifyDataChange() {
        submitList(data?.getAllData())
    }

    open fun setData(data: DATA?) {
        this.data?.removeOnDataChangedLister(onDataChangeLister)
        this.data = data
        this.data?.setOnDataChangedListener(onDataChangeLister)
    }

    fun setListener(listener: LIS?, update: Boolean = true) {
        this.listener = listener
        if (update) {
            notifyDataSetChanged()
        }
    }

    fun onDestroy() {
        this.data?.removeOnDataChangedLister(onDataChangeLister)
    }
}

interface BaseRecyclerListener<I> : BaseListener {
    fun itemClick(position: Int, item: I) {}
    fun itemLongClick(position: Int, item: I) {}
}