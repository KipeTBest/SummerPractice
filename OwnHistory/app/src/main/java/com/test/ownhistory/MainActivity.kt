package com.test.ownhistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.test.ownhistory.List.ShoppingListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        val fragment: ShoppingListFragment = ShoppingListFragment()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController
    }
}