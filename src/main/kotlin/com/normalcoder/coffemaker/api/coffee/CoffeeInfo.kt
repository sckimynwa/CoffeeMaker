package com.normalcoder.coffemaker.api.coffee

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="coffee_info")
class CoffeeInfo {
    @Id
    @Column(name = "id", nullable = false)
    val id: Int? = null

    @Column(name = "name", nullable = false)
    val name: String? = null

    @Column(name = "price", nullable = false)
    val price: Int? = null
}