package com.example.quote.gazigara

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat.getDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.main_item_view.view.*


class MainAdapter (val context: Context, private val Items: ArrayList<MainModel>) : BaseAdapter() {
    val newImage = context.getDrawable(R.mipmap.picture1)
    val newImage1 = context.getDrawable(R.mipmap.picture3)
    val newImage2 = context.getDrawable(R.mipmap.picture11)
    val newImage3 = context.getDrawable(R.mipmap.picture6)
    val newImage4 = context.getDrawable(R.mipmap.picture8)

    val imagelist = arrayOf(
        newImage,
        newImage1,
        newImage2,
        newImage3,
        newImage4
    )
    override fun getView(count : Int, p1: View?, p2: ViewGroup?): View {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.main_item_view, null)
        val itemName : TextView = itemView.name
        val backgroundImage : ImageView = itemView.ItemImage

        itemName.text = Items[count].name
        backgroundImage.setImageDrawable((imagelist[count]))


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