package com.example.projectebussi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectebussi.helper.Helper
import com.example.projectebussi.model.Produk
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_produk.*
import kotlinx.android.synthetic.main.toolbar_custom.*

class DetailProdukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        getInfo()
    }

    fun getInfo(){
        val data = intent.getStringExtra("extra")
        val produk = Gson().fromJson<Produk>(data, Produk::class.java)

        //set value
        tv_nama.text = produk.nama_produk
        tv_harga.text = Helper().gantiRupiah(produk.harga_produk.toString())
        tv_deskripsi.text = produk.keterangan
        detailBerat.text = produk.beratisi_produk.toString()
        detailStok.text = produk.stok.toString()

        val img = "http://192.168.43.136/uploads/"+ produk.foto_produk
        Picasso.get()
            .load(img)
            .placeholder(R.drawable.wortel)
            .error(R.drawable.wortel)
            .resize(400, 400)
            .into(image)
        
        setSupportActionBar(toolbar)
        supportActionBar!!.title = produk.nama_produk
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}