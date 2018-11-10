package com.example.quote.gazigara

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat.getDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView


class MainAdapter (val context: Context, private val Items: ArrayList<MainModel>) : BaseAdapter() {
    val newImage:Drawable = context.getDrawable(R.mipmap.pink_nochar_logo)
    val newImage1:Drawable = context.getDrawable(R.mipmap.pink_nochar_logo)
    val newImage2:Drawable = context.getDrawable(R.mipmap.pink_nochar_logo)
    val newImage3:Drawable = context.getDrawable(R.mipmap.pink_nochar_logo)
    val newImage4:Drawable = context.getDrawable(R.mipmap.pink_nochar_logo)

    val imagelist = arrayOf(
        newImage,
        newImage1,
        newImage2,
        newImage3,
        newImage4
    )
    override fun getView(count : Int, p1: View?, p2: ViewGroup?): View {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.main_item_view, null)
        val itemName : TextView = itemView.findViewById(R.id.name)
        val background : ImageButton = itemView.findViewById(R.id.ItemImage)

        itemName.setText(Items[0].name)
        background.setImageDrawable(imagelist[0])


        return itemView
    }

    override fun getItem(position: Int): Any {
        return Items[position]
    }

    override fun getItemId(position: Int): Long {
        return Items[position].hashCode().toLong()
    }

    override fun getCount(): Int {
        return Items.size
    }
}