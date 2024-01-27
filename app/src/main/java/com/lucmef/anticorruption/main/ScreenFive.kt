package com.lucmef.anticorruption.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import com.lucmef.anticorruption.start.ScreenSecond
import kotlinx.android.synthetic.main.screen_five.*
import kotlinx.android.synthetic.main.screen_four.*
import kotlinx.android.synthetic.main.screen_four.btnFour

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenFive :Fragment(R.layout.screen_five){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFive.setOnClickListener {
            (requireActivity() as BaseActivity).onBackPressed()
        }
    }
}