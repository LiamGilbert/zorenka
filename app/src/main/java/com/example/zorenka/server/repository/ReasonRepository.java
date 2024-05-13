package com.example.zorenka.server.repository;

import com.example.zorenka.server.model.ReasonEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ReasonRepository {
    @GET("v1/reasons")
    Call<List<ReasonEntity>> getAll();
}
