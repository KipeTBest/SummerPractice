package com.test.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var txtName: EditText? = null
    private var intHeight: EditText? = null
    private var intWeight: EditText? = null
    private var intAge: EditText? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        intHeight = findViewById(R.id.intHeight)
        intWeight = findViewById(R.id.intWeight)
        intAge = findViewById(R.id.intAge)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            makeCalculating()
        }
    }

    fun makeCalculating() {
        val name: Int = txtName?.text.toString().length
        val height: Int = intHeight?.text.toString().toInt()
        val weight: Int = intWeight?.text.toString().toInt()
        val age: Int = intAge?.text.toString().toInt()
        if (name in 1..50 && height in 1..250 && weight in 1..250 && age in 1..150) {
            val result = (height + weight) - (name + age)
            if (result % 2 == 0) {
                Log.e("Ответ", "Сегодня ваш удачный день!")
            } else {
                Log.e("Ответ", "Сегодня вам не повезет.")
            }
        } else {
            Log.e("Ответ", "Данные введены некорректно")
        }
    }

}