package com.example.todayscocktail.data

import com.google.gson.annotations.SerializedName

data class DrinksListRemoteEntity(
    @SerializedName("drinks")
    val drinksList: List<DrinkRemoteEntity>
)