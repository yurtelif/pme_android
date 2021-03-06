package com.janus.platoon.ui.main

import android.os.Bundle
import com.janus.platoon.R
import com.janus.platoon.base.BaseActivity
import com.janus.platoon.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutRes: Int = R.layout.activity_main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) { // to prevent recreation of fragment, vm, etc..
            loadFragment(R.id.container, MainActivityFragment(), false)
        }
    }
}