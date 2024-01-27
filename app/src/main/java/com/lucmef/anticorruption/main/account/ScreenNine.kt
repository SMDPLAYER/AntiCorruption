package com.lucmef.anticorruption.main.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import kotlinx.android.synthetic.main.screen_nine.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenNine :Fragment(R.layout.screen_nine){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack.setOnClickListener {
            requireActivity() .onBackPressed()
        }
        btnNine.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenTen()).commit()

        }
    }
}