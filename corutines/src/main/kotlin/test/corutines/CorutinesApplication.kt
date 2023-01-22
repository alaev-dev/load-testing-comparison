package test.corutines

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CorutinesApplication

fun main(args: Array<String>) {
    runApplication<CorutinesApplication>(*args)
}
