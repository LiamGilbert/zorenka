package com.example.zorenka.server.repository;

import com.example.zorenka.server.model.AuthorizationEntity;
import com.example.zorenka.server.model.LoginDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthRepository {

    @POST("/v1/authorization/login")
    Call<AuthorizationEntity> login(@Body LoginDto dto);
}
