/*
 * Copyright (c) 2019 Loblaw Digital. All rights reserved.
 */

package ca.keanequibilan.interview.model

data class UserResult(val results: List<User>)

data class User(
    val gender: String,
    val name: Name,
    val email: String,
    val dob: DateOfBirth,
    val picture: Picture
)

data class DateOfBirth(val date: String, val age: Int)
data class Picture(val large: String, val thumbnail: String)
data class Name(val first: String, val last: String)
