package com.mh.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val vaccineList: ArrayList<VaccineModel>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            lateinit var vaccineTitle: TextView
            lateinit var vaccineImage: ImageView

            init {
                vaccineTitle = itemView.findViewById(R.id.text1)
                vaccineImage = itemView.findViewById(R.id.imageView)

                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, "You have choosen ${vaccineList[adapterPosition].name}", Toast.LENGTH_SHORT).show()
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return vaccineList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.setText(vaccineList[position].name)
        holder.vaccineImage.setImageResource(vaccineList[position].img)
    }
}