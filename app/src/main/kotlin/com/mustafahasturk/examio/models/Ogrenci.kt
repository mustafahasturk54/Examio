package com.mustafahasturk.examio.models

import com.google.gson.annotations.SerializedName

data class Ogrenci(
    @SerializedName("okul_adi")
    val okulAdi: String,
    @SerializedName("ogretim_yili")
    val ogretimYili: String,
    @SerializedName("donem")
    val donem: String,
    @SerializedName("sinav_adi")
    val sinavAdi: String,
    @SerializedName("ogrenci_adi")
    val ogrenciAdi: String,
    @SerializedName("sinif")
    val sinif: String,
    @SerializedName("numara")
    val numara: String,
    @SerializedName("sinavlar")
    val sinavlar: List<Sinav>
)

