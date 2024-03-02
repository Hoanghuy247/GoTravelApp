package com.example.gotravel.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

typealias InflateActivity<T> = (LayoutInflater) -> T

abstract class BaseActivity<B: ViewDataBinding>(private val inflate: InflateActivity<B>) : AppCompatActivity() {
        lateinit var mBinding: B
            private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = inflate.invoke(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}