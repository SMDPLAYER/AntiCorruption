package com.lucmef.anticorruption.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucmef.anticorruption.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenFirst()).commit()
    }
}