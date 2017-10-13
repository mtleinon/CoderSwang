package com.example.mikat.coderswang.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.R
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by mikat on 13.10.2017.
 */
class CategoryRecycleAdapter(val context: Context, val categories: List<Category>)
            : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(position, context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(position: Int, context: Context) {
            categoryImage?.setImageResource(
                    context.resources.getIdentifier(categories[position].image,
                    "drawable",
                    context.packageName))
            categoryName?.text = categories[position].title
        }
    }
}