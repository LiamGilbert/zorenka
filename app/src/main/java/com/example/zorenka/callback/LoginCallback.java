package com.example.zorenka.callback;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.zorenka.server.model.AuthorizationEntity;
import com.example.zorenka.view.AttendanceActivity;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginCallback implements Callback<AuthorizationEntity> {

    private final Context context;

    public LoginCallback(Context context) {
        this.context = context;
    }

    @Override
    public void onResponse(Call<AuthorizationEntity> call, Response<AuthorizationEntity> response) {
        if (response.isSuccessful()) {
            Intent intent = new Intent(context, AttendanceActivity.class);
            context.startActivity(intent);
        } else {
            try {
                Log.e("API_RESPONSE", "bad request: " + response.errorBody().string());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFailure(Call<AuthorizationEntity> call, Throwable t) {
        Log.e("API_RESPONSE", "fail request: " + t.getMessage());
        t.printStackTrace();
    }
}
