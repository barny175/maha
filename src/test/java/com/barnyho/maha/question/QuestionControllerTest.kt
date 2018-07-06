package com.barnyho.maha.question

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class QuestionControllerTest(@Autowired private val restTemplate: TestRestTemplate) {

    @Test
    fun findAll() {
        assertThat(restTemplate.getForObject<String>("/")).isEqualTo("[{\"id\":1,\"question\":\"What's up?\"}]")
    }
}