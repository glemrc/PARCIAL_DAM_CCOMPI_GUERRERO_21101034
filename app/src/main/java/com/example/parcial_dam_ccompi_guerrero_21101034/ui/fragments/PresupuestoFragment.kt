package com.example.parcial_dam_ccompi_guerrero_21101034.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.parcial_dam_ccompi_guerrero_21101034.R


class PresupuestoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_presupuesto, container, false)
        val etVuelo = rootView.findViewById<EditText>(R.id.etVuelo)
        val etComida = rootView.findViewById<EditText>(R.id.etComida)
        val etCant = rootView.findViewById<EditText>(R.id.etCant)
        val etAloja = rootView.findViewById<EditText>(R.id.etAloja)
        val tvTotal = rootView.findViewById<TextView>(R.id.tvTotal)
        val bntCalcular = rootView.findViewById<Button>(R.id.btnCalcular)


        bntCalcular.setOnClickListener {
            val costoVuelo = etVuelo.text.toString()
            val costoComida = etComida.text.toString()
            val cantNoches = etCant.text.toString()
            val costoAloja = etAloja.text.toString()

            if (costoVuelo.isNotEmpty() && costoComida.isNotEmpty() && cantNoches.isNotEmpty() && costoAloja.isNotEmpty()) {
                val vuelo = costoVuelo.toDouble()
                val comida = costoComida.toDouble()
                val noches = cantNoches.toDouble()
                val aloja = costoAloja.toDouble()

                if (comida > 0 && noches > 0 && aloja > 0) {
                    val presupuesto = vuelo + (comida * noches) + (aloja * noches)
                    tvTotal.text = "$presupuesto"
                }else{
                    tvTotal.text = "Ingrese valores válidos"
                }
            }
            }
            return rootView

        }
}