package com.example.assignment3.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment3.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.stfalcon.pricerangebar.model.BarEntry
import kotlinx.android.synthetic.main.fragment_filter.*

/**
 * A simple [Fragment] subclass.
 */
class FilterFragment : BottomSheetDialogFragment() {

    private val barEntrys = ArrayList<BarEntry>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRangeBar()

        btnCancel.setOnClickListener {
            this.dismiss()
        }
    }

    private fun initRangeBar() {
        barEntrys.add(BarEntry(30.0f, 5.0f))
        barEntrys.add(BarEntry(32.0f, 7.0f))
        barEntrys.add(BarEntry(34.0f, 10.0f))
        barEntrys.add(BarEntry(36.0f, 11.0f))
        barEntrys.add(BarEntry(38.0f, 14.0f))
        barEntrys.add(BarEntry(40.0f, 15.0f))

        rangeBar.setEntries(barEntrys)
    }
}
