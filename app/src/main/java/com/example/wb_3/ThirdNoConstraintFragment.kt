package com.example.wb_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat

class ThirdNoConstraintFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = ResourcesCompat.getColor(resources,
            R.color.green, null)

        activity?.window?.navigationBarColor = ResourcesCompat.getColor(resources,
            R.color.white, null)

        return inflater.inflate(R.layout.fragment_third_no_constraint, container, false)
    }
}