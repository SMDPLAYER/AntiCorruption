package com.lucmef.anticorruption.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import com.lucmef.anticorruption.start.ScreenSecond
import kotlinx.android.synthetic.main.screen_four.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenFour :Fragment(R.layout.screen_four){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFour.setOnClickListener {
            (requireActivity() as BaseActivity).openNavView()
        }
    }
}