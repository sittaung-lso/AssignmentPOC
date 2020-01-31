package com.example.assignment3.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.assignment3.R
import com.example.assignment3.adapters.NearbyListAdapter
import kotlinx.android.synthetic.main.fragment_nearby.*

/**
 * A simple [Fragment] subclass.
 */
class NearbyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearby, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = NearbyListAdapter()

        val linearLayoutManager = LinearLayoutManager(activity)
        rvNearby.layoutManager = linearLayoutManager
        rvNearby.adapter =adapter
    }
}
