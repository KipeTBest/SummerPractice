package com.test.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.task2.databinding.FragmentFriendBinding

class FriendFragment : Fragment(R.layout.fragment_friend) {

    private var _binding: FragmentFriendBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFriendBinding.bind(view)

        with(binding) {
            btnMessage.setOnClickListener {
                findNavController().navigate(R.id.action_friendFragment_to_messageFragment)
            }
        }
    }

}