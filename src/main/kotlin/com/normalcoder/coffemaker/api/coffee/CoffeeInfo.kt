package com.normalcoder.coffemaker.api.coffee

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="coffee_info")
class CoffeeInfo (
    @Id
    @GeneratedValue
    val id: Int? = null,
    val name: String? = null,
    val price: String? = null
)