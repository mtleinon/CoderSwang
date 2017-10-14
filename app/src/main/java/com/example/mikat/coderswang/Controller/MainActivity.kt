package com.example.mikat.coderswang.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.mikat.coderswang.Adapters.CategoryAdapter
import com.example.mikat.coderswang.Adapters.CategoryRecycleAdapter
import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.ProductsActivity
import com.example.mikat.coderswang.R
import com.example.mikat.coderswang.Services.DataService
import com.example.mikat.coderswang.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.category_list_item.*
import java.util.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryListView.adapter = CategoryRecycleAdapter(this, DataService.categories) {
            category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        categoryListView.layoutManager = LinearLayoutManager(this)
        categoryListView.setHasFixedSize(true)

    }
}
