package com.example.mikat.coderswang.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.R
import com.example.mikat.coderswang.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
