package com.mh.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val vaccineList: ArrayList<VaccineModel>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            lateinit var vaccineTitle: TextView
            lateinit var vaccineImage: ImageView

            init {
                vaccineTitle = itemView.findViewById(R.id.text1)
                vaccineImage = itemView.findViewById(R.id.imageView)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout, parent, false)
        return TODO("Provide the return value")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}