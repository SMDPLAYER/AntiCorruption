package com.lucmef.anticorruption.start

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lucmef.anticorruption.R
import com.lucmef.anticorruption.main.BaseActivity
import com.lucmef.anticorruption.main.ScreenFour
import kotlinx.android.synthetic.main.screen_third.*

/**
 * Created by Siddikov Mukhriddin on 12/4/21
 */
class ScreenThird :Fragment(R.layout.screen_third){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnThird.setOnClickListener {
            startActivity(Intent(requireActivity(), BaseActivity::class.java))
            requireActivity().finish()
        }
    }
}