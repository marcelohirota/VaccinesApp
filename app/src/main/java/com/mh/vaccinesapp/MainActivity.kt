package com.mh.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Data Source
        var vaccineList = ArrayList<VaccineModel>()

        val v1 : VaccineModel = VaccineModel("COVID-19", R.drawable.vaccine1)
        val v2 : VaccineModel = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine4)
        val v3 : VaccineModel = VaccineModel("Tetanus Vaccine", R.drawable.vaccine5)
        val v4 : VaccineModel = VaccineModel("Pneumococcal Vaccine", R.drawable.vaccine6)
        val v5 : VaccineModel = VaccineModel("Rotavirus", R.drawable.vaccine7)
        val v6 : VaccineModel = VaccineModel("Measles Vaccine", R.drawable.vaccine8)
        val v7 : VaccineModel = VaccineModel("Chickenpox Vaccine", R.drawable.vaccine9)

        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)

        // Adapter
        val adapter = MyAdapter(vaccineList)

        recyclerView.adapter = adapter
    }
}