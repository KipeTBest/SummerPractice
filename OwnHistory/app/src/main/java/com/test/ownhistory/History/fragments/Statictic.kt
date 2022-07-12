package com.test.ownhistory.History.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.ownhistory.R
import com.test.ownhistory.History.Repository.Repository
import com.test.ownhistory.databinding.FragmentStaticticBinding

class Statictic : Fragment(R.layout.fragment_statictic) {

    private var _binding: FragmentStaticticBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentStaticticBinding.bind(view)

        with(binding) {
            buttonBack.setOnClickListener {
                findNavController().navigate(R.id.action_statictic_to_historyList)
            }
        }

        binding.maxIn.text = "All time Income: ${Repository.calcIn().toString()} Р"
        binding.maxOut.text = "All time Outlay: ${Repository.calcOut().toString()} Р"
    }
}