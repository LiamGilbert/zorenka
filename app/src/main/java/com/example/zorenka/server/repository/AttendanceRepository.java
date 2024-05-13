package com.example.zorenka.server.repository;

import com.example.zorenka.server.model.AttendanceCreateDto;
import com.example.zorenka.server.model.AttendanceEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AttendanceRepository {
    @GET("/v1/attendance")
    Call<List<AttendanceEntity>> getAll();

    @POST("/v1/attendance")
    Call<AttendanceEntity> create(@Body AttendanceCreateDto attendance);
}
