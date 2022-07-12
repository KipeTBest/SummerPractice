package com.test.ownhistory.History.InHistory

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.test.ownhistory.History.Models.Product
import com.test.ownhistory.databinding.FragmentHistoryItemBinding

class InHolder(
    private val binding: FragmentHistoryItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBindIn(product: Product) {
        with(binding) {
            if (product.category.s) {
                name.text = product.name
                category.text = product.category.name
                cost.text = "${product.cost.toString()} P"
                name.setTextColor(Color.parseColor("#B364DC4A"))
            }
        }
    }
}