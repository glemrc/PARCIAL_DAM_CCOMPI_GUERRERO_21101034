package com.example.parcial_dam_ccompi_guerrero_21101034.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_dam_ccompi_guerrero_21101034.R
import com.example.parcial_dam_ccompi_guerrero_21101034.ui.model.HotelModel

class HotelAdapter(private var lstHotel: List<HotelModel>):
        RecyclerView.Adapter<HotelAdapter.ViewHolder>() {
            class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val ivHotel = itemView.findViewById<ImageView>(R.id.ivHotel)
                val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
                val tvCalificacion = itemView.findViewById<TextView>(R.id.tvCalificacion)
                val tvDireccion = itemView.findViewById<TextView>(R.id.tvDireccion)
                val tvCosto = itemView.findViewById<TextView>(R.id.tvCosto)
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.item_hotel,parent,false))
        }

        override fun getItemCount(): Int {
            return lstHotel.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemHotel = lstHotel[position]
            holder.ivHotel.setImageResource(itemHotel.imagen)
            holder.tvNombre.text = itemHotel.name
            holder.tvCalificacion.text = itemHotel.calificacion
            holder.tvDireccion.text = itemHotel.direccion
            holder.tvCosto.text = itemHotel.costo
        }

        }

