package com.normalcoder.coffemaker.api.coffee

import org.springframework.stereotype.Service

@Service
class CoffeeService(
    private val coffeeRepository: CoffeeRepository,
) {
    fun getAllCoffee(): List<CoffeeInfo> {
        return coffeeRepository.findAll();
    }
}