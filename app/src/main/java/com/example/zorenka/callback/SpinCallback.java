package com.example.zorenka.callback;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpinCallback<TEntity> implements Callback<List<TEntity>> {

    private ResponseCallback callback;

    public interface ResponseCallback<TEntity> {
        void fetch(List<TEntity> items);
    }

    public void onFetch(ResponseCallback callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(Call<List<TEntity>> call, Response<List<TEntity>> response) {
        if(response.isSuccessful() && callback != null) {
            callback.fetch(response.body());
        }
    }

    @Override
    public void onFailure(Call<List<TEntity>> call, Throwable t) {

    }
}
