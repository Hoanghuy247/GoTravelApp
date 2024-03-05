package com.example.gotravel.ui.home.delegate

import android.widget.Toast
import com.example.gotravel.ui.base.BaseDelegate
import com.example.gotravel.ui.home.HomeFragment
import com.example.gotravel.ui.home.HomeViewModel

class HomeToolBarDelegate(f: HomeFragment, vm: HomeViewModel) :
    BaseDelegate<HomeFragment, HomeViewModel>(f,vm) {

    override fun onViewCreated() {
        super.onViewCreated()

        mFragment?.mBinding?.toolbarLayout?.btnMenuBar?.setOnClickListener {
            Toast.makeText(mActivity.applicationContext,"Click", Toast.LENGTH_SHORT).show()
        }
    }
}