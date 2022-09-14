package com.example.chapter4latihanberita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BeritaAdapter (var listBerita : ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onClick:((ListBerita) -> Unit)? = null

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view)  {
        var judulBerita = itemView.findViewById<TextView>(R.id.judulBerita)
        var tanggalBerita = itemView.findViewById<TextView>(R.id.tanggalBerita)
        var imageBerita = itemView.findViewById<ImageView>(R.id.imgBerita)
        var card = itemView.findViewById<CardView>(R.id.cardBerita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judulBerita.text = listBerita[position].judul
        holder.tanggalBerita.text = listBerita[position].tanggal
        holder.imageBerita.setImageResource(listBerita[position].gambar)
        holder.card.setOnClickListener{
            onClick?.invoke(listBerita[position])
        }
    }

    override fun getItemCount(): Int = listBerita.size

    fun setDataBerita(beritaList: ArrayList<ListBerita>){
        this.listBerita = beritaList
    }
}