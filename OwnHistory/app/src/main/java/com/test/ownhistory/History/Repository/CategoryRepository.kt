package com.test.ownhistory.History.Repository

import com.test.ownhistory.History.Models.Category

object CategoryRepository {

    val categories = arrayListOf<Category>(
        Category(0, "SALARY", true),
        Category(1, "PAYMENTS", true),
        Category(2, "DEPOSITS", true),
        Category(3, "INCOME_ETC", true),
        Category(4, "TAXES", false),
        Category(5, "CREDITS", false),
        Category(6, "COMMUNAL", false),
        Category(7, "TRANSPORT", false),
        Category(8, "FOOD", false),
        Category(9, "MEDICINE", false),
        Category(10, "TEACH", false),
        Category(11, "OUTCOME_ETC", false)
    )
}