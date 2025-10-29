package kr.ac.kumoh.s20210181.s25w08retrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SongApiConfig {
    const val PROJECT_URL = "https://xgjmebwopnpcejxdsavh.supabase.co"
    const val SERVER_URL = "$PROJECT_URL/rest/v1/"
    const val API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Inhnam1lYndvcG5wY2VqeGRzYXZoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjE1NDcwMDMsImV4cCI6MjA3NzEyMzAwM30.UmKOeDTeraM9uih_exzibA288bTbJcacYl2am-Vpx0E"

    // Retrofit Singleton Instance
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // SongApi 인터페이스 구현체
    val songService: SongApi by lazy {
        retrofit.create(SongApi::class.java)
    }
}