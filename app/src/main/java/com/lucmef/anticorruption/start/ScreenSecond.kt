package com.lucmef.anticorruption.start

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import kotlinx.android.synthetic.main.screen_second.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenSecond :Fragment(R.layout.screen_second){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSecond.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenThird()).commit()
        }
    }
}