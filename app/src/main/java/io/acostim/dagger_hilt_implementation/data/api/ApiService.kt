package io.acostim.dagger_hilt_implementation.data.api

import io.acostim.dagger_hilt_implementation.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}