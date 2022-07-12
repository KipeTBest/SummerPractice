package com.test.ownhistory.History.OutHistory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.ownhistory.History.Models.Product
import com.test.ownhistory.databinding.FragmentHistoryItemBinding

class OutAdapter(
    private val list: List<Product>
) : RecyclerView.Adapter<OutHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OutHolder = OutHolder(
        FragmentHistoryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(
        holder: OutHolder,
        position: Int
    ) {
        holder.onBindOut(list[position])
    }

    override fun getItemCount(): Int = list.size
}