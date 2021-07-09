package com.example.projectebussi.model;

import java.io.Serializable;

public class Produk implements Serializable {
    public int id;
    public String nama_produk;
    public int kategori;
    public int stok;
    public int beratisi_produk;
    public int harga_produk;
    public String foto_produk;
    public String keterangan;
    public String created_at;
    public String updated_at;
}
