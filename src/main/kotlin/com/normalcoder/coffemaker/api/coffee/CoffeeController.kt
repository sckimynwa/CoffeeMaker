package com.normalcoder.coffemaker.api.coffee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class CoffeeController(
    private val coffeeService: CoffeeService
) {
    @GetMapping("coffee/info")
    fun getAllCoffee(request: HttpServletRequest): List<CoffeeInfo> {
        return coffeeService.getAllCoffee()
    }

    @PostMapping("coffee/info")
    fun createCoffee(request: HttpServletRequest, @RequestBody requestBody: CoffeeInfoRequest): CoffeeInfo {
        println(requestBody)
        return coffeeService.createCoffee(CoffeeInfoRequest(
            name = requestBody.name,
            price = requestBody.price
        ))
    }
}