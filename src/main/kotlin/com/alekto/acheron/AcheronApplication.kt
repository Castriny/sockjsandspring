package com.alekto.acheron

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AcheronApplication

fun main(args: Array<String>) {
	runApplication<AcheronApplication>(*args)
}
