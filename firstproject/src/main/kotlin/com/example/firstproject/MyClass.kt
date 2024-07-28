package com.example.firstproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyClass {

    @GetMapping("hello")
    fun sayHello() : String{
        return "hello bhaskar"
    }
}