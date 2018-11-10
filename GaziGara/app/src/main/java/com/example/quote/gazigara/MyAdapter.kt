package com.example.quote.gazigara

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat.getDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.my_item_list.view.*


class MyAdapter (val context: Context, private val Items2 : ArrayList<MyModel>) : BaseAdapter() {

    val newImage1 = context.getDrawable(R.mipmap.picture3)
    val newImage3 = context.getDrawable(R.mipmap.picture6)

    val imagelist = arrayOf(
        newImage1,
        newImage3
    )
    override fun getView(count : Int, p1: View?, p2: ViewGroup?): View {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.my_item_list, null)
        val itemName2 : TextView = itemView.name2
        val backgroundImage2 : ImageView = itemView.ItemImage2

        itemName2.text = Items2[count].name
        backgroundImage2.setImageDrawable((imagelist[count]))



        return itemView
    }

    override fun getItem(position: Int): Any {
        return Items2[position]
    }

    override fun getItemId(position: Int): Long {
        return Items2[position].hashCode().toLong()
    }

    override fun getCount(): Int {
        return Items2.size
    }
}