package kr.ac.kumoh.s20230176.w26w10controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf("Cosmic Echo", "Neon Forever", "Velvet Bitter", "소란스러운 비밀")


    @GetMapping("/songs")
    fun getSongs() = title
}