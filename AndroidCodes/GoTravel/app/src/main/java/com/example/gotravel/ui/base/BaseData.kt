package com.example.gotravel.ui.base

import android.util.Log
import java.lang.Exception

open class BaseData<ITEM> {

    var data: List<ITEM> = emptyList()
        private set
    private val listerList: ArrayList<OnDataChangeLister> = ArrayList()

    open fun setData(data: List<ITEM>) {
        this.data = data
        notifyDataChanged()
    }

    open fun getAllData() : List<ITEM> {
        return data
    }

    open fun getSize() : Int{
        return data.size
    }

    open fun getItemAtPosition(position: Int): ITEM? {
        return try {
            data[position]
        } catch (e: Exception) {
            Log.e("TAG", "getItemAtPosition: $position - ${e.message}" )
            return null
        }
    }

    private fun notifyDataChanged() {
        for (lister in listerList) {
            lister.onDataChange()
        }
    }

    //TODO: to add register lister to ArrayList
    fun setOnDataChangedListener(listener: OnDataChangeLister) {
        listerList.add(listener)
        listener.onDataChange()
    }

    //TODO: to remove registered lister to ArrayList
    fun removeOnDataChangedLister(listener: OnDataChangeLister) {
        listerList.remove(listener)
    }

    interface OnDataChangeLister {
        fun onDataChange()
    }
}

