package com.example.gotravel.ui.home.delegate

import androidx.drawerlayout.widget.DrawerLayout
import androidx.core.view.GravityCompat
import com.example.gotravel.ui.base.BaseDelegate
import com.example.gotravel.ui.home.HomeFragment
import com.example.gotravel.ui.home.HomeViewModel

class HomeDrawerDelegate(f: HomeFragment, vm: HomeViewModel) :
    BaseDelegate<HomeFragment, HomeViewModel>(f, vm) {

    private val mDrawerLayout = mFragment.mBinding?.drawerLayout


    override fun onViewCreated() {
        super.onViewCreated()
    }

    fun openDrawer() {
        //mDrawerLayout?.openDrawer(GravityCompat.START)
    }
}