package com.example.funapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.funapp.adapters.ActivityAdapter
import com.example.funapp.data.model.ActivityItem
import com.example.funapp.databinding.FragmentActivitiesBinding


class ActivitiesFragment : Fragment() {

    private lateinit var binding: FragmentActivitiesBinding

    private var arrayList:ArrayList <ActivityItem>? = null
    private var gridView:GridView? = null
    private var ActivityAdapter: ActivityAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gridView = binding.gridView
        arrayList = ArrayList()
        arrayList = setDataList()
        ActivityAdapter = context?.let { ActivityAdapter(it,arrayList!!) }
        gridView?.adapter = ActivityAdapter
    }

    private fun setDataList(): ArrayList<ActivityItem>? {
        var arrayList: ArrayList<ActivityItem> = ArrayList()
        arrayList.add(ActivityItem(R.drawable.gokarting,"GoKarting"))
        arrayList.add(ActivityItem(R.drawable.paintball,"Paintball"))
        arrayList.add(ActivityItem(R.drawable.hiking,"Hiking"))
        arrayList.add(ActivityItem(R.drawable.jog,"Jogging"))
        arrayList.add(ActivityItem(R.drawable.clubbing,"Night out Dancing"))

        return arrayList
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activities, container, false)


    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ActivitiesFragment().apply {

            }
    }
}