package com.normalcoder.coffemaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoffemakerApplication

fun main(args: Array<String>) {
	runApplication<CoffemakerApplication>(*args)
}
