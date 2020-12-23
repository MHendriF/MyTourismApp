package com.hendri.mytourismapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

class ListTourismResponse(

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("places")
    val places: List<TourismResponse>
)