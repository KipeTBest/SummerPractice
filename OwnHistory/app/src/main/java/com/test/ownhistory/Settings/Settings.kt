package com.test.ownhistory.Settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.test.ownhistory.R
import com.test.ownhistory.databinding.FragmentSettingsBinding

class Settings : Fragment(R.layout.fragment_settings) {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)

    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}