package com.normalcoder.coffemaker.api.coffee

import org.springframework.data.jpa.repository.JpaRepository

interface CoffeeRepository: JpaRepository<CoffeeInfo, Long> {
    fun findById(coffeeId: Int): CoffeeInfo
}