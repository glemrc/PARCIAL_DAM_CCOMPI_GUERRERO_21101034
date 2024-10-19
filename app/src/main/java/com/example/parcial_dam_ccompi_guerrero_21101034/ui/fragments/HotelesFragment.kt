package com.example.parcial_dam_ccompi_guerrero_21101034.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_dam_ccompi_guerrero_21101034.R
import com.example.parcial_dam_ccompi_guerrero_21101034.ui.adapter.HotelAdapter
import com.example.parcial_dam_ccompi_guerrero_21101034.ui.home.HomeViewModel
import com.example.parcial_dam_ccompi_guerrero_21101034.ui.model.HotelModel

class HotelesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val view: View = inflater.inflate(R.layout.fragment_hoteles, container, false)

        val rvHoteles = view.findViewById<RecyclerView>(R.id.rvHoteles)
        rvHoteles.layoutManager = LinearLayoutManager(requireContext())
        rvHoteles.adapter = HotelAdapter(getHoteles())
        return view
    }

    private fun getHoteles(): List<HotelModel> {
        val lstHoteles = ArrayList<HotelModel>()
        lstHoteles.add(HotelModel(1,R.drawable.skyline,"Skyline Haven Hotel","4.5 de 5 (1955 opiniones)","Avenida Central","$98"  ))
        lstHoteles.add(HotelModel(2,R.drawable.ocean,"Oceanview Retreat","4.2 de 5 (741 opiniones)","Miami","$90"  ))
        lstHoteles.add(HotelModel(3,R.drawable.golden,"Golden Palm Resort","3.9 de 5 (2500 opiniones)","USA","$88"  ))
        lstHoteles.add(HotelModel(1,R.drawable.royal,"Royal Horizon Suites","3.5 de 5 (7844 opiniones)","Royal Plaza","$60"  ))
        return lstHoteles
    }

}