package com.test.ownhistory.History.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.test.ownhistory.History.InHistory.InAdapter
import com.test.ownhistory.R
import com.test.ownhistory.History.Repository.Repository
import com.test.ownhistory.databinding.FragmentIncomeHistoryBinding

class IncomeHistory : Fragment(R.layout.fragment_income_history) {

    private var _binding: FragmentIncomeHistoryBinding? = null
    private val binding get() = _binding!!

    private var adapterIn: InAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentIncomeHistoryBinding.bind(view)

        with(binding) {
            allButton.setOnClickListener {
                findNavController().navigate(R.id.action_incomeHistory_to_historyList)
            }
            onlyOutButton.setOnClickListener {
                findNavController().navigate(R.id.action_incomeHistory_to_outlayHistory)
            }
            statButton.setOnClickListener {
                findNavController().navigate(R.id.action_incomeHistory_to_statictic)
            }
        }

        adapterIn = InAdapter(Repository.products)
        binding.recyclerView.adapter = adapterIn
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}