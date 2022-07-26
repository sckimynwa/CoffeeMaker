package com.normalcoder.coffemaker.api.coffee

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class CoffeeService(
    private val coffeeRepository: CoffeeRepository,
) {
    fun listCoffee(): ListCoffeeResponse {
        return ListCoffeeResponse(coffeeList = coffeeRepository.findAll())
    }

    fun createCoffee(request: CreateCoffeeRequest): CoffeeInfo {
        return coffeeRepository.save(CoffeeInfo(
            name = request.name,
            price = request.price
        ))
    }

    fun updateCoffee(id: Long, request: UpdateCoffeeRequest): CoffeeInfo? {
        return coffeeRepository.findByIdOrNull(id)?.let{coffee ->
            coffee.name = request.name ?: coffee.name
            coffee.price = request.price ?: coffee.price
            coffeeRepository.save(coffee)
        }
    }

    fun deleteCoffee(request: DeleteCoffeeRequest) {
        return coffeeRepository.deleteById(request.id)
    }
}