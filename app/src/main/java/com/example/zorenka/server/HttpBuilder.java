package com.example.zorenka.server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpBuilder {

    private final Retrofit retrofit;

    public HttpBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ServerConstants.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <TRepository> TRepository createRepository(Class<TRepository> repositoryClass) {
        return retrofit.create(repositoryClass);
    }
}
