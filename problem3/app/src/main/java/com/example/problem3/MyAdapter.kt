package com.example.problem3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_item_list.view.*
import kotlinx.android.synthetic.main.activity_item_list.view.imageView
import kotlinx.android.synthetic.main.activity_itemlist.view.*

class MyAdapter (
    var productList: ArrayList<Product>,
    val itemClickListener: ItemClickListener
): RecyclerView.Adapter<MyAdapter.ListViewHolder>(){

    interface ItemClickListener {
        fun onItemClick(position: Int)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener{
                itemClickListener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_itemlist,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.imageView4.setImageResource(productList[position].image)
        holder.itemView.item_desc.text = productList[position].title
        holder.itemView.price_desc.text = productList[position].price.toString()
        holder.itemView.color_desc.text = productList[position].color

    }

    override fun getItemCount(): Int {
        return productList.size
    }
}