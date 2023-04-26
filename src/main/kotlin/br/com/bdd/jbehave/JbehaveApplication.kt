package br.com.bdd.jbehave

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JbehaveApplication

fun main(args: Array<String>) {
	runApplication<JbehaveApplication>(*args)
}
