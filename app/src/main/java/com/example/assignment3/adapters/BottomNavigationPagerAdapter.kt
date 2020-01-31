package com.example.assignment3.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignment3.fragments.BookmarksFragment
import com.example.assignment3.fragments.DateRangeFragment
import com.example.assignment3.fragments.ExploreFragment
import com.example.assignment3.fragments.HomeFragment

class BottomNavigationPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return HomeFragment()
            1 -> return ExploreFragment()
            2 -> return DateRangeFragment()
            3 -> return BookmarksFragment()
            else -> return HomeFragment()
        }
    }
}