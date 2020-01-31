package com.example.assignment3.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.assignment3.R
import com.example.assignment3.adapters.TagPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = TagPagerAdapter(activity!!)
        view.pager.adapter = pagerAdapter

        TabLayoutMediator(tabs, pager) { tab: TabLayout.Tab, position: Int ->
            when (position) {
                0 -> tab.text = "Nearby"
                1 -> tab.text = "Popular"
                2 -> tab.text = "All"
            }
        }.attach()
    }

}
