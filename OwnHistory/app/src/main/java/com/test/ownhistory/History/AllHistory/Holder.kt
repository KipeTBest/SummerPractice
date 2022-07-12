package com.test.ownhistory.History.AllHistory

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.test.ownhistory.History.Models.Product
import com.test.ownhistory.databinding.FragmentHistoryItemBinding

class Holder(
    private val binding: FragmentHistoryItemBinding,
    private val onItemClick: (Product) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(product: Product) {
        with(binding) {
            name.text = product.name
            category.text = product.category.name
            cost.text = "${product.cost.toString()} P"
            if (product.category.s) {
                name.setTextColor(Color.parseColor("#B364DC4A"))
            } else {
                name.setTextColor(Color.parseColor("#B3DA4343"))
            }
            root.setOnClickListener {
                onItemClick(product)
            }
        }
    }
}