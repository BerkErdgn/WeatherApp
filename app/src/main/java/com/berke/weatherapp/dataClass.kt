package com.berke.weatherapp

import com.google.gson.annotations.SerializedName


data class dataClass (
    @SerializedName("timeZone")
    val timeZone : String,
    @SerializedName("temp")
    val temp : String,
    @SerializedName("humidity")
    val humidity : String,
    @SerializedName("pressure")
    val pressure : String,
    @SerializedName("main")
    val main : String,
    @SerializedName("speed")
    val speed : String,
    @SerializedName("icon")
    val icon : String

    ){
}