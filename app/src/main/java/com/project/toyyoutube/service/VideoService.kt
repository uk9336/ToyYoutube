package com.project.toyyoutube.service

import com.project.toyyoutube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/178dbe0d-f51a-4e0d-b29e-612037f9df8e")
    fun listVideos(): Call<VideoDto>
}