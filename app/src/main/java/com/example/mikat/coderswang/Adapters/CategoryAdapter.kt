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

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            println("Lifecycle: convertView == null: Position=$position")
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById<ImageView>(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById<TextView>(R.id.categoryName)
            categoryView.tag = holder
        } else {
            println("Lifecycle: convertView != null: Position=$position")
            categoryView = convertView
            holder = categoryView.tag as ViewHolder
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
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
    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}