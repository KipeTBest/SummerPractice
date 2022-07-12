package com.test.ownhistory.History.AllHistory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.ownhistory.History.Models.Product
import com.test.ownhistory.databinding.FragmentHistoryItemBinding

class Adapter(
    private val list: List<Product>,
    private val onItemClick: (Product) -> Unit,

    ) : RecyclerView.Adapter<Holder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Holder = Holder(
        binding = FragmentHistoryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemClick
    )

    override fun onBindViewHolder(
        holder: Holder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}