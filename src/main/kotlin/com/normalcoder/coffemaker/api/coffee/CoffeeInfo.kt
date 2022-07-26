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
    val id: Long? = null,
    var name: String? = null,
    var price: String? = null
)