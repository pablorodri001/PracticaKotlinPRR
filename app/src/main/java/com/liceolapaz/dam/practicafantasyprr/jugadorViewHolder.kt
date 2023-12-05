package com.liceolapaz.dam.practicafantasyprr

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.liceolapaz.dam.practicafantasyprr.Jugador
import com.liceolapaz.dam.practicafantasyprr.R

class JugadorViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val nombre = view.findViewById<TextView>(R.id.tvNombre)
    val posicion = view.findViewById<TextView>(R.id.tvPosicion)
    val precio = view.findViewById<TextView>(R.id.tvPrecio)
    val puntos = view.findViewById<TextView>(R.id.tvPuntos)

    fun render(jugador: Jugador, onClickListener: (Jugador) -> Unit){
        nombre.text = jugador.nombre
        posicion.text = jugador.posicion
        precio.text = jugador.precio.toString()
        puntos.text = jugador.puntos.toString()
        itemView.setOnClickListener {onClickListener(jugador)}
    }
}