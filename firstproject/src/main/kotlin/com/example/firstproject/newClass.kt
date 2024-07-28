package com.example.firstproject

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NewClass {

    @Autowired // this indicate this ,we don;t need to make object
    lateinit var dog :Dog
    @GetMapping("bark")
    fun bark() : String {
        return dog.dogBark()
    }
}