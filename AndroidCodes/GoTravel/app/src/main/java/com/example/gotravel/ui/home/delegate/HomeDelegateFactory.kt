package com.example.gotravel.ui.home.delegate

import com.example.gotravel.ui.base.BaseDelegate
import com.example.gotravel.ui.base.DelegateFactory
import com.example.gotravel.ui.base.KeyDelegate
import com.example.gotravel.ui.home.HomeFragment
import com.example.gotravel.ui.home.HomeViewModel

class HomeDelegateFactory(f: HomeFragment, vm: HomeViewModel) :
    DelegateFactory<HomeFragment, HomeViewModel>(f, vm) {

    override fun createDelegateList(): List<Pair<KeyDelegate, BaseDelegate<HomeFragment, HomeViewModel>>> {
        return mutableListOf(
            Pair(KeyDelegate.HOME_DRAWER, HomeDrawerDelegate(fragment, viewModel))
        )
    }
}