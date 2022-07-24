package com.normalcoder.coffemaker.api.coffee

import org.springframework.stereotype.Service

@Service
class CoffeeService(
    private val coffeeRepository: CoffeeRepository,
) {
    fun getCoffeeInfo(coffeeId: Int): CoffeeInfoResponse {
        val coffeeInfo = coffeeRepository.findById(coffeeId);
        return CoffeeInfoResponse(
            id = coffeeInfo.id,
            name = coffeeInfo.name,
            price = coffeeInfo.price
        )
    }
}