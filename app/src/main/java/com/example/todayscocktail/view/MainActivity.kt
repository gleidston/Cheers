package com.example.todayscocktail.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.todayscocktail.R
import com.example.todayscocktail.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
//    private lateinit var drinkName: TextView
//    private lateinit var drinkContainer: ConstraintLayout
//    private lateinit var drinkImage: ImageView

    //    private val viewModel: MainViewModel by viewModels()
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getDrinks()

        val recycler: RecyclerView = findViewById(R.id.items_recycler_view)
        val adapter = DrinksAdapter(this)

        recycler.adapter = adapter

        viewModel.listDrinks.observe(this, Observer {
            adapter.drinkList = it.drinksList
        })
    }
}