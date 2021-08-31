package io.acostim.dagger_hilt_implementation.data.repository

import io.acostim.dagger_hilt_implementation.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}