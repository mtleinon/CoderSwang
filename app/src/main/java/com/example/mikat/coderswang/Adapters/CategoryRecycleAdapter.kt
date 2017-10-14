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

/**
 * Created by mikat on 13.10.2017.
 */
class CategoryRecycleAdapter(val context: Context,
                             val categories: List<Category>,
                             val itemClick: (Category) -> Unit)
            : RecyclerView.Adapter<CategoryRecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context)
                .inflate(R.layout.category_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, position: Int) {
        viewHolder?.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        private val categoryImageView = itemView?.findViewById<ImageView>(R.id.categoryImage)
        private val categoryNameView = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bind(category: Category) {
            categoryImageView?.setImageResource(
                    context.resources.getIdentifier(category.image,
                    "drawable",
                    context.packageName))
            categoryNameView?.text = category.title
            itemView.setOnClickListener { itemClick(category)}
        }
    }
}