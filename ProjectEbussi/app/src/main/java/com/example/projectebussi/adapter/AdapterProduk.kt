package com.example.projectebussi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectebussi.R
import com.example.projectebussi.model.Produk

class AdapterProduk(var data:ArrayList<Produk>):RecyclerView.Adapter<AdapterProduk.Holder>() {

    class Holder(view: View):RecyclerView.ViewHolder(view){
        val tvNama = view.findViewById<TextView>(R.id.tv_nama)
        val tvHarga = view.findViewById<TextView>(R.id.tv_harga)
        val tvStok = view.findViewById<TextView>(R.id.tv_stok)
        val deskripsi = view.findViewById<TextView>(R.id.Deskripsi)
        val imgProduk = view.findViewById<ImageView>(R.id.img_produk)
        val layout = view.findViewById<CardView>(R.id.layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvNama.text = data[position].nama_produk
        holder.deskripsi.text = data[position].keterangan
        holder.tvHarga.text = data[position].harga_produk.toString()
        holder.tvStok.text = data[position].stok.toString()
//        holder.imgProduk.setImageResource(data[position].foto_produk)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}