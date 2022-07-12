package com.test.ownhistory.History.Models

data class Product(
    val id: Int,
    val name: String,
    val category: Category,
    val cost: Int
) {
}