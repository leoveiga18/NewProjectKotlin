package com.example.newprojectkotlin

class Dog {
    var owner: Human? = null
    var name: String? = null

    fun sayHi() {
        println("Hy my name is $name and my owner is ${owner?.name}")
    }
}