package com.febryan.intentactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Siswa (
    var nama : String,
    var umur : Int,
    var gender : Char,
    var kelas : String,
    var lulus : Boolean,
    var tinggiBadan : Double
) : Parcelable


