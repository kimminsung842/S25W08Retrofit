package kr.ac.kumoh.s20210181.s25w08retrofit.model

data class Song(
    val id: String,
    val title: String,
    val singer: String,
    val rating: Int,
    val lyrics: String?,
)
