package com.normalcoder.coffemaker.api.coffee

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CoffeeController(
    private val coffeeService: CoffeeService
) {
    @GetMapping("coffee/info")
    fun listCoffee(): ListCoffeeResponse {
        return coffeeService.listCoffee()
    }

    @PostMapping("coffee/info")
    fun createCoffee(@RequestBody requestBody: CreateCoffeeRequest): CoffeeInfo {
        val request = CreateCoffeeRequest(
            name = requestBody.name,
            price = requestBody.price
        )
        return coffeeService.createCoffee(request)
    }

    @PutMapping("coffee/info/{id}")
    fun updateCoffee(@RequestBody requestBody: UpdateCoffeeRequest, @PathVariable id: Long,): CoffeeInfo? {
        return coffeeService.updateCoffee(id, requestBody)
    }

    @DeleteMapping("coffee/info/{id}")
    fun deleteCoffee(@PathVariable id: Long) {
        val request = DeleteCoffeeRequest(id = id)
        return coffeeService.deleteCoffee(request)
    }
}