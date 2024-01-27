package com.lucmef.anticorruption.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.lucmef.anticorruption.R
import com.lucmef.anticorruption.main.account.ScreenEight
import com.lucmef.anticorruption.start.ScreenFirst
import com.lucmef.anticorruption.start.ScreenSecond
import kotlinx.android.synthetic.main.activity_base.*

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        initNavView()
        initNavView1()
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenFour()).commit()

    }

    private fun initNavView() {
        navView.itemIconTintList = null
        val header=navView.getHeaderView(0)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_point -> openBookMark()
                R.id.menu_book_mark -> openBookMark1()
                R.id.menu_search -> openBookMark2()
                R.id.menuHelp -> openBookMark3()
//                R.id.menuSignOut -> signOut()
            }
            drawerLayout.closeDrawer(navView)
            true
        }
        drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener{
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}
            override fun onDrawerOpened(drawerView: View){  }
            override fun onDrawerClosed(drawerView: View){}
            override fun onDrawerStateChanged(newState: Int) {}
        })
    }
    private fun initNavView1() {
        navView1.itemIconTintList = null
        val header=navView.getHeaderView(0)

        navView1.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_point -> openBookMark0()
                R.id.menu_book_mark -> openBookMark1()
                R.id.menu_search -> openBookMark2()
                R.id.menuPassword -> openBookMark3()
//                R.id.menuSignOut -> signOut()
            }
            drawerLayout.closeDrawer(navView)
            true
        }
        drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener{
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}
            override fun onDrawerOpened(drawerView: View){  }
            override fun onDrawerClosed(drawerView: View){}
            override fun onDrawerStateChanged(newState: Int) {}
        })
    }

    private fun openBookMark() {
        drawerLayout.openDrawer(navView1)
    }

    private fun openBookMark0() {
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenEight()).commit()
    }
    private fun openBookMark1() {
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenFive()).addToBackStack(null).commit()
    }
    private fun openBookMark2() {
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenSiz()).addToBackStack(null).commit()
    }
    private fun openBookMark3() {
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, ScreenSeven()).addToBackStack(null).commit()
    }
    fun openNavView() {
        drawerLayout.openDrawer(navView)
    }
    override fun onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(navView)) {
            this.drawerLayout.closeDrawer(navView)
        } else {
            super.onBackPressed()
        }
    }
}