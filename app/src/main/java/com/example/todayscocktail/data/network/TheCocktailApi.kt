package com.example.todayscocktail.data.network

import com.example.todayscocktail.data.DrinksListRemoteEntity
import retrofit2.http.GET

interface TheCocktailApi {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinksListRemoteEntity
}