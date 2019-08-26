/*
 * Copyright (c) 2019 Loblaw Digital. All rights reserved.
 */

package ca.keanequibilan.interview.network

import ca.keanequibilan.interview.model.UserResult
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {
    private val client: RandomUserApi = Retrofit.Builder()
        .baseUrl("https://randomuser.me/api/")
        .client(OkHttpClient())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create().asLenient())
        .build()
        .create(RandomUserApi::class.java)

    /**
     * Use this method to retrieve an Rx [Single] that will emit a [UserResult] object. The result
     * will have [count] number of users.
     */
    fun getUsers(count: Int): Single<UserResult> = client.getUsers(count)
}
