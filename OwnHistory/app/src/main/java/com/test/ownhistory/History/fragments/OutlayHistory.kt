package com.test.ownhistory.History.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.ownhistory.History.OutHistory.OutAdapter
import com.test.ownhistory.R
import com.test.ownhistory.History.Repository.Repository
import com.test.ownhistory.databinding.FragmentOutlayHistoryBinding

class OutlayHistory : Fragment(R.layout.fragment_outlay_history) {

    private var _binding: FragmentOutlayHistoryBinding? = null
    private val binding get() = _binding!!

    private var adapterOut: OutAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOutlayHistoryBinding.bind(view)

        with(binding) {
            allButton.setOnClickListener {
                findNavController().navigate(R.id.action_outlayHistory_to_historyList)
            }
            onlyInButton.setOnClickListener {
                findNavController().navigate(R.id.action_outlayHistory_to_incomeHistory)
            }
            statButton.setOnClickListener {
                findNavController().navigate(R.id.action_outlayHistory_to_statictic)
            }
        }

        adapterOut = OutAdapter(Repository.products)
        binding.recyclerView.adapter = adapterOut
    }

}