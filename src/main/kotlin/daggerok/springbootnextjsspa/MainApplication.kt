package daggerok.springbootnextjsspa

import org.apache.logging.log4j.kotlin.logger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.kotlin.core.publisher.toMono

@RestController
@SpringBootApplication
class MainApplication {

    private companion object { val log = logger() }

    @GetMapping("/api/user/first-name")
    fun getUserFirstName() =
        mapOf("firstName" to "Maksim")
            .also { log.info("getUserFirstName: $it") }
            .toMono()

    @GetMapping("/api/user/last-name")
    fun getUserLastName() =
        mapOf("lastName" to "Kostromin")
            .also { log.info("getUserLastName: $it") }
            .toMono()
}

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}
