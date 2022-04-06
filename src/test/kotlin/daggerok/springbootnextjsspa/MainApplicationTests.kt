package daggerok.springbootnextjsspa

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.kotlin.test.test
import reactor.test.StepVerifier

@SpringBootTest(webEnvironment = RANDOM_PORT)
@Suppress("SpringJavaInjectionPointsAutowiringInspection")
class MainApplicationTests(@Autowired builder: WebClient.Builder, @LocalServerPort port: Int) {

    val webClient = builder.baseUrl("http://127.0.0.1:$port").build()

    @Test
    fun `should get first name`() {
        val firstName = webClient.get()
            .uri("/api/user/first-name")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono<Map<String, String>>()
        StepVerifier.create(firstName)
            .expectNext(mapOf("firstName" to "Maksim"))
            .verifyComplete()
    }

    @Test
    fun `should get last name`() {
        webClient.get()
            .uri("/api/user/last-name")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono<Map<String, String>>()
            .test()
            .expectNext(mapOf("lastName" to "Kostromin"))
            .verifyComplete()
    }
}
