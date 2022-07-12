package com.test.ownhistory.History.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.test.ownhistory.History.AllHistory.Adapter
import com.test.ownhistory.History.Repository.Repository
import com.test.ownhistory.R
import com.test.ownhistory.databinding.FragmentHistoryListBinding

class HistoryList : Fragment(R.layout.fragment_history_list) {

    private var _binding: FragmentHistoryListBinding? = null
    private val binding get() = _binding!!

    private var adapter: Adapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHistoryListBinding.bind(view)

        with(binding) {
            onlyInButton.setOnClickListener {
                findNavController().navigate(R.id.action_historyList_to_incomeHistory)
            }
            onlyOutButton.setOnClickListener {
                findNavController().navigate(R.id.action_historyList_to_outlayHistory)
            }
            statButton.setOnClickListener {
                findNavController().navigate(R.id.action_historyList_to_statictic)
            }
        }

        adapter = Adapter(Repository.products) {
            Snackbar.make(
                binding.root,
                "Id: ${it.id}",
                Snackbar.LENGTH_LONG
            ).show()
        }
        binding.recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}