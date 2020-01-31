package com.example.assignment3.fragments


import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.assignment3.R
import com.example.assignment3.adapters.NearbyListAdapter
import com.example.assignment3.adapters.TopSearchListAdapter
import kotlinx.android.synthetic.main.fragment_explore.*
import kotlinx.android.synthetic.main.fragment_explore.view.*
import kotlinx.android.synthetic.main.fragment_nearby.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnFilter.setOnClickListener {
            val bottomSheetDialogFragment = FilterFragment()
            bottomSheetDialogFragment.show(activity!!.supportFragmentManager, bottomSheetDialogFragment.tag)
        }

        val calendar = Calendar.getInstance()
        val day = calendar[Calendar.DAY_OF_MONTH]
        val month = calendar[Calendar.MONTH]
        val year = calendar[Calendar.YEAR]
        val simpleDateFormat = SimpleDateFormat("dd MMM, yyyy")
        val currentDate = simpleDateFormat.format(calendar.time)

        view.etCheckIn.setText(currentDate)
        view.etCheckOut.setText(currentDate)

        view.etCheckIn.setOnClickListener {
            val picker = DatePickerDialog(
                view.context,
                DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                    calendar.set(year, monthOfYear, dayOfMonth)
                    val dateString = simpleDateFormat.format(calendar.time)
                    etCheckIn.setText(dateString)
                }, year, month, day
            )

            picker.show()
        }

        view.etCheckOut.setOnClickListener {
            val picker = DatePickerDialog(
                view.context,
                DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                    calendar.set(year, monthOfYear, dayOfMonth)
                    val dateString = simpleDateFormat.format(calendar.time)
                    etCheckOut.setText(dateString)
                }, year, month, day
            )

            picker.show()
        }

        val adapter = TopSearchListAdapter()

        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        rvTopSearches.layoutManager = linearLayoutManager
        rvTopSearches.adapter =adapter
    }
}
