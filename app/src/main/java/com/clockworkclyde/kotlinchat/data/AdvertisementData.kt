package com.clockworkclyde.kotlinchat.data

import android.location.Address

data class AdvertisementData(
    val id: Int,
    val adTitle: String,
    val adAddress: String,
    val photosList: List<AdvertisementPhoto>,

) {
}