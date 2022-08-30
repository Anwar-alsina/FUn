package com.example.funapp.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.funapp.ActivitiesFragment
import com.example.funapp.R
import com.example.funapp.data.model.ActivityItem

class ActivityAdapter(var context: Context, var arrayList: ArrayList<ActivityItem>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.activity_card_items,null)
        var activityImage:ImageView = view.findViewById(R.id.activityImage)
        var activityName:TextView = view.findViewById(R.id.tvActivityTitle)

        var listItem:ActivityItem = arrayList.get(position)

        activityImage.setImageResource(listItem.activityImage!!)
        activityName.text = listItem.activityTitle

        return view
    }

}