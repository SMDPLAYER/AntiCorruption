package com.lucmef.anticorruption

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.screen_four.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenFour :Fragment(R.layout.screen_four){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFour.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer,ScreenSecond()).commit()
        }
    }
}