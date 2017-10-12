package com.example.mikat.coderswang.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.R

/**
 * Created by mikat on 12.10.2017.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage = categoryView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = categoryView.findViewById<TextView>(R.id.categoryName)

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println("Lifecycle: resourceId = $resourceId" )

        categoryName.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}