package com.lucmef.anticorruption

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.screen_first.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenFirst :Fragment(R.layout.screen_first){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnClick.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer,ScreenSecond()).commit()
        }
    }
}