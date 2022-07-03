package com.test.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.test.task2.databinding.FragmentMessageBinding

class MessageFragment : Fragment(R.layout.fragment_message) {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMessageBinding.bind(view)

        with(binding) {
            etText.text = "We came from a fragment of Friend"
        }
    }
}