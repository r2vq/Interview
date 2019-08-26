package ca.keanequibilan.interview.network

import ca.keanequibilan.interview.model.UserResult
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {

    @GET(".")
    fun getUsers(@Query("results") count: Int): Single<UserResult>
}
