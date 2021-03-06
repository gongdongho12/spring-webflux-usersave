package com.dongholab.usersave.domain.account

data class AuthReqModel(
    override val id: String,
    override var password: String,
    val name: String,
    val roleType: String
): AuthBase(id, password)