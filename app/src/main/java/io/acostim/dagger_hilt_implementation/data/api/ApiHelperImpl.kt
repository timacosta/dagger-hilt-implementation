package io.acostim.dagger_hilt_implementation.data.api

import io.acostim.dagger_hilt_implementation.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}