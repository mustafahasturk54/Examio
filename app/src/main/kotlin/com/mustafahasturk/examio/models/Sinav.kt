package com.mustafahasturk.examio.models

import com.google.gson.annotations.SerializedName

data class Sinav(
    @SerializedName("sinav_kodu")
    val sinavKodu: String,
    @SerializedName("sinav_tarihi")
    val sinavTarihi: String,
    @SerializedName("sinav_saati")
    val sinavSaati: String,
    @SerializedName("ders_adi")
    val dersAdi: String,
    @SerializedName("sinava_girecegi_salon")
    val sinavaSalon: String,
    @SerializedName("salon_yer_no")
    val salonYerNo: String
)

