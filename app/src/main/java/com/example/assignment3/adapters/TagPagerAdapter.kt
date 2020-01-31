package com.example.assignment3.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignment3.fragments.AllFragment
import com.example.assignment3.fragments.NearbyFragment
import com.example.assignment3.fragments.PopularFragment

class TagPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when {
            position == 0 -> return NearbyFragment()
            position == 1 -> return PopularFragment()
            else -> return AllFragment()
        }
    }


}