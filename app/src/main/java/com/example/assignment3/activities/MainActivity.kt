package com.example.assignment3.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.assignment3.R
import com.example.assignment3.adapters.BottomNavigationPagerAdapter
import com.example.assignment3.fragments.BookmarksFragment
import com.example.assignment3.fragments.DateRangeFragment
import com.example.assignment3.fragments.ExploreFragment
import com.example.assignment3.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        changeFragment(HomeFragment())
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when (item.itemId) {
            R.id.action_home -> {
                changeFragment(HomeFragment())
            }
            R.id.action_explore -> {
                changeFragment(ExploreFragment())
            }
            R.id.action_date_range -> {
                changeFragment(DateRangeFragment())
            }
            R.id.action_bookmarks -> {
                changeFragment(BookmarksFragment())
            }
        }
        true
    }

    private fun changeFragment(fragment : Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainer, fragment)
            .commit()
    }
}
