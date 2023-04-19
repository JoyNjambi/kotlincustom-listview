package com.example.midcustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mycntx: Context, var resourses:Int,var items:List<Models>):ArrayAdapter<Models>(mycntx,resourses,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
      val layoutInflater:LayoutInflater=LayoutInflater.from(mycntx)
     val view :View =layoutInflater.inflate(resourses,null)
      val imageView:ImageView=view.findViewById(R.id.image)
      val Tv_itttle:TextView=view.findViewById(R.id.Tv_itttle)
      val Tv_description:TextView=view.findViewById(R.id.Tv_subtext)

        var myitems:Models=items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        Tv_itttle.text=myitems.tittle
        Tv_description.text=myitems.description

        return view
    }
}