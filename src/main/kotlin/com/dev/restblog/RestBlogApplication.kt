package com.dev.restblog

import lombok.RequiredArgsConstructor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//* Toy Project to learn Spring-Boot Kotlin.
//* Lazy Initialization is enabled; IOT disable this feature for certain bean, add annotation '@Lazy(false)'

@RestController
@SpringBootApplication
@RequiredArgsConstructor
class RestBlogApplication {

//    val mainRouter: MainRouter = MainRouter();
//    @RequestMapping("/welcome")
//    fun root(): MainRouter {
//        return mainRouter
//    }

}

fun main(args: Array<String>) { // Run Spring Application: Start spring -> auto-configured Tomcat web server.
    runApplication<RestBlogApplication>(*args)
}
