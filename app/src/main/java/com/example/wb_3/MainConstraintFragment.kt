package com.example.wb_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import com.example.wb_3.databinding.FragmentMainConstraintBinding


class MainConstraintFragment : Fragment() {

    private var binding: FragmentMainConstraintBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = ResourcesCompat.getColor(
            resources,
            R.color.purple_dark, null
        )

        activity?.window?.navigationBarColor = ResourcesCompat.getColor(
            resources,
            R.color.white, null
        )

        binding = FragmentMainConstraintBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
    }

    private fun setupListeners() {
        val navController = findNavController()
        binding?.apply {
            constraintScreenOne.setOnClickListener {
                navController.navigate(R.id.action_mainConstraintFragment_to_firstConstraintFragment)
            }

            noConstraintScreenOne.setOnClickListener {
                navController.navigate(R.id.action_mainConstraintFragment_to_firstNoConstraintFragment)
            }

            constraintScreenTwo.setOnClickListener {
                navController.navigate(R.id.action_mainConstraintFragment_to_secondConstraintFragment)
            }

            noConstraintScreenTwo.setOnClickListener {
                navController.navigate(R.id.action_mainConstraintFragment_to_secondNoConstraintFragment)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}