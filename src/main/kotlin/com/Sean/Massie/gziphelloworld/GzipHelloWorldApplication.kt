package com.Sean.Massie.gziphelloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GzipHelloWorldApplication

fun main(args: Array<String>) {
    SpringApplication.run(GzipHelloWorldApplication::class.java, *args)
}

@RestController
class GzipController()
{
    @RequestMapping("/")
    fun home(): GzipResponse
    {
        return GzipResponse()
    }
}

data class GzipResponse(val name: String = "Sean",
                        val age: Int = 26)