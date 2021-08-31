package io.acostim.dagger_hilt_implementation.data.api

import io.acostim.dagger_hilt_implementation.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}