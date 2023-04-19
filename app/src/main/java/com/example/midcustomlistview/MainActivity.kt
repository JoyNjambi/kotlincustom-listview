package com.example.midcustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Models>()

        //adding images
        list.add(Models("red","This is a red car",R.drawable.car2))
        list.add(Models("chocolate","This is a chocolate cake",R.drawable.cake))
        list.add(Models("Beautiful","This is a beautiful picture",R.drawable.insta))
        list.add(Models("wild","This tiger is a wild animal",R.drawable.tiger))
        list.add(Models("Resort","This view is from a beachside resort",R.drawable.hotel))
        list.add(Models("Burger","This is a juicy burger",R.drawable.burger))

        listView.adapter=MyAdapter(this,R.layout.row,list)
    }
}