package com.dicoding.example.mygithubuser

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization token : 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")
    fun getSearchUsers(
        @Query("q") query : String
    ): Call<UserResponse>
}