package com.test.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.task2.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {
            btnMusic.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_musicFragment2)
            }
            btnClip.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_clipFragment2)
            }
            btnFriend.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_friendFragment)
            }
            btnNews.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_newsFragment2)
            }
            btnVideo.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_videoFragment2)
            }
        }
    }
}