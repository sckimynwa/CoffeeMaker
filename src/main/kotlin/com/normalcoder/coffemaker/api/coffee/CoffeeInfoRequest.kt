package com.normalcoder.coffemaker.api.coffee

data class CreateCoffeeRequest(
    val name: String,
    val price: String
)

data class UpdateCoffeeRequest(
    val name: String?,
    val price: String?
)

data class DeleteCoffeeRequest(
    val id: Long,
)