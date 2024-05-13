package com.example.zorenka.server.repository;

import com.example.zorenka.server.model.ChildrenEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChildRepository {

    @GET("v1/childrens")
    Call<List<ChildrenEntity>> getAll();
}
