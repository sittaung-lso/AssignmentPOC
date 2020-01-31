package com.example.assignment3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment3.R
import com.example.assignment3.views.viewholder.PlacesViewHolder

class TopSearchListAdapter : RecyclerView.Adapter<PlacesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_top_searches, parent, false)
        return PlacesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: PlacesViewHolder, position: Int) {

    }
}