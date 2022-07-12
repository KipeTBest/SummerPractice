package com.test.ownhistory.History.InHistory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.ownhistory.History.Models.Product
import com.test.ownhistory.databinding.FragmentHistoryItemBinding

class InAdapter(
    private val list: List<Product>
) : RecyclerView.Adapter<InHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InHolder = InHolder(
        FragmentHistoryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(
        holder: InHolder,
        position: Int
    ) {
        holder.onBindIn(list[position])
    }

    override fun getItemCount(): Int = list.size
}