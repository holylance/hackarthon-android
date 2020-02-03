package com.dkb.hackathonandroid.ui.util.model

import java.math.BigInteger
import java.time.ZonedDateTime
import java.util.*

data class User(
    val id: BigInteger,
    val uuid: UUID,
    val fullName: String,
    val phoneNumber: String,
    val email: String,
    val username: String,
    val password: String,
    val description: String,
    val createdDate: ZonedDateTime,
    val updatedDate: ZonedDateTime
)
