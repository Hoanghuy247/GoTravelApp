package com.example.gotravel.ui.base

import android.app.Activity
import android.util.Log

open class BaseDelegate<F : BaseFragment<*>, VM : BaseViewModel>(
    val mFragment : F,
    val mViewModel : VM
) {
    protected val mActivity: Activity
        get() = mFragment.requireActivity()

    init {
        Log.d("TAG", "onCreate: ")
    }

    open fun onCreateView() {}

    open fun onViewCreated() {}

    open fun onResume() {}

    open fun onPause() {}

    open fun onDestroy() {}
}