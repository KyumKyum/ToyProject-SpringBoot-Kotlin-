package com.dev.restblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class RestBlogApplication {
    @RequestMapping("/")
    fun home() = "Test!"
}

fun main(args: Array<String>) { // Run Spring Application: Start spring -> auto-configured Tomcat web server.
    runApplication<RestBlogApplication>(*args)
}
