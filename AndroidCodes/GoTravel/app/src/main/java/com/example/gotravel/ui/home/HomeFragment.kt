package com.example.gotravel.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.gotravel.R
import com.example.gotravel.databinding.FragmentHomeBinding
import com.example.gotravel.ui.base.BaseFragment
import com.example.gotravel.ui.base.KeyDelegate
import com.example.gotravel.ui.home.delegate.HomeDrawerDelegate
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override val mViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val bottomNavView: BottomNavigationView = requireActivity().findViewById(R.id.bottom_menu)
        bottomNavView.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun openDrawer() {
        val delegate = getDelegate(KeyDelegate.HOME_DRAWER) as?  HomeDrawerDelegate
        //delegate?.openDrawer()
    }
}