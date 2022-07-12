package com.test.ownhistory.History.Repository

import com.test.ownhistory.History.Models.Product

object Repository {

    private val CategoryRepository = com.test.ownhistory.History.Repository.CategoryRepository.categories

    val products = arrayListOf<Product>(
        Product(0, "Fish", CategoryRepository[8], 259),
        Product(1, "Eggs", CategoryRepository[8], 60),
        Product(2, "Salary", CategoryRepository[0], 30000),
        Product(3, "Pencils", CategoryRepository[10], 89),
        Product(4, "Kommunalka", CategoryRepository[6], 2500),
        Product(5, "Home", CategoryRepository[11], 15000),
        Product(6, "Internet", CategoryRepository[6], 500),
        Product(7, "Soup", CategoryRepository[8], 150)
    )

    fun calcIn(): Int {
        var sum: Int = 0
        for (i in 0 until products.size) {
            if (products[i].category.s) {
                sum += products[i].cost
            }
        }
        return sum
    }

    fun calcOut(): Int {
        var sum: Int = 0
        for (i in 0 until products.size) {
            if (!products[i].category.s) {
                sum += products[i].cost
            }
        }
        return sum
    }

    fun inList(): List<Product> {
        var lst: ArrayList<Product> = products
        for (i in 0 until products.size) {
            if (products[i].category.s) {
                lst.add(products[i])
            }
        }
        return lst
    }
}