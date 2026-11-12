package kr.ac.kumoh.s20230176.w26w10controller.repository

import kr.ac.kumoh.s20230176.w26w10controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class MemorySongRepository : SongRepository{
    private val songs = listOf(
        Song(1, "Cosmic Echo", "NEBULA"),
        Song(2, "Neon Fever", "SPARK"),
        Song(3, "Velvet Bitter", "LUNA"),
        Song(4, "소란스러운 비밀", "Windy"),
    )

    override fun findAll(): List<Song> {
        return songs.toList()
    }
}