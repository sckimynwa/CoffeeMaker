package com.normalcoder.coffemaker.api.coffee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class CoffeeController(
    private val coffeeService: CoffeeService
) {
    @GetMapping("coffee/info")
    fun getCoffeeInfo(request: HttpServletRequest): CoffeeInfoResponse {
        val coffeeId = request.getAttribute("id") as Int
        return coffeeService.getCoffeeInfo(coffeeId)
    }
}