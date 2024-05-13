package com.example.zorenka.callback;

import android.content.Context;
import android.content.Intent;

import com.example.zorenka.server.model.AttendanceEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateAttendanceCallback implements Callback<AttendanceEntity> {

    private final Context context;

    public CreateAttendanceCallback(Context context) {
        this.context = context;
    }

    @Override
    public void onResponse(Call<AttendanceEntity> call, Response<AttendanceEntity> response) {
        if (response.isSuccessful()) {
            Intent intent = new Intent(context, AttendanceAllCallback.class);
            context.startActivity(intent);
        }
    }

    @Override
    public void onFailure(Call<AttendanceEntity> call, Throwable t) {

    }
}
