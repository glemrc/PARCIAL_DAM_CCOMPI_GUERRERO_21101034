package com.example.parcial_dam_ccompi_guerrero_21101034.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.parcial_dam_ccompi_guerrero_21101034.R


class SegurosFragment : Fragment() {

    var arrHot =arrayOf(
        "GlobeGuard Insurance","SafeJourney Coverage","Traveshield Protection","VoyaSecure","Wander Travel Insurance")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_seguros, container, false)

        val lstSeguros = view.findViewById<ListView>(R.id.lstSeguros)

        val adaptador = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,arrHot)

        lstSeguros.adapter = adaptador
        return view

    }

}