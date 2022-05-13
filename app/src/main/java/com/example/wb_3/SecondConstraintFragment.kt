package com.example.wb_3

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsetsController
import androidx.core.content.res.ResourcesCompat

class SecondConstraintFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = ResourcesCompat.getColor(resources,
            R.color.light_blue, null)

        activity?.window?.navigationBarColor = ResourcesCompat.getColor(resources,
            R.color.white, null)

        return inflater.inflate(R.layout.fragment_second_constraint, container, false)
    }
}