package com.example.mikat.coderswang.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.mikat.coderswang.Adapters.CategoryAdapter
import com.example.mikat.coderswang.Adapters.CategoryRecycleAdapter
import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.R
import com.example.mikat.coderswang.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryListView.adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.layoutManager = LinearLayoutManager(this)
        categoryListView.setHasFixedSize(true)

    }
}
