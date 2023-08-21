package com.tutoring.lunchbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchBotApplication

fun main(args: Array<String>) {
    runApplication<LunchBotApplication>(*args)
}
