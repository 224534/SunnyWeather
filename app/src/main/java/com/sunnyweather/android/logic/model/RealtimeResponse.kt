package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime : Realtime)

    data class Realtime(val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: Airquality)

    data class Airquality(val aqi: Aqi)

    data class Aqi(val chn: Float)

}