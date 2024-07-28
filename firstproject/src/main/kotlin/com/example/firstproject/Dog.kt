package com.example.firstproject

import org.springframework.web.bind.annotation.RestController

@RestController
class Dog {

    fun dogBark() :String {
        return "Woof! Woof!"
    }
}