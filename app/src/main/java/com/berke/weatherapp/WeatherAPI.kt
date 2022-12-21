package com.berke.weatherapp

import retrofit2.Call
import retrofit2.http.GET

interface WeatherAPI {



    //  https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}
    // istanbul late 41.015137      long 28.979530
    @GET("data/2.5/onecall?lat=41.015137&lon=28.979530&exclude=daily&appid=8ddadecc7ae4f56fee73b2b405a63659")
    fun getdata (): Call<List<dataClass>>

}