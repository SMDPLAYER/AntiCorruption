package com.lucmef.anticorruption

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.screen_third.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenThird :Fragment(R.layout.screen_third){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnThird.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer,ScreenFour()).commit()
        }
    }
}