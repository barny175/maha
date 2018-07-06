package com.barnyho.maha.question

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QuestionController {
    @GetMapping("/")
    fun getAll(): List<Question> {
        return listOf(Question(1L, "What's up?"))
    }
}