package com.lucmef.anticorruption.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import kotlinx.android.synthetic.main.screen_seven.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenSeven :Fragment(R.layout.screen_seven){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack.setOnClickListener {
            (requireActivity() as BaseActivity).onBackPressed()
        }
        btnNews.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenSiz()).commit()

        }
    }
}