package com.example.zorenka.callback;

import android.content.Context;
import android.content.Intent;
import android.os.Message;

import com.example.zorenka.server.model.AttendanceEntity;
import com.example.zorenka.view.dialog.MessageDialog;

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
        } else {
            MessageDialog dialog = new MessageDialog(context);
            dialog.showDialog("Ошибка!", "Проверьте введенные данные");
        }
    }

    @Override
    public void onFailure(Call<AttendanceEntity> call, Throwable t) {
        MessageDialog dialog = new MessageDialog(context);
        dialog.showDialog("Ошибка!", "Проверьте подключение к интернету!");
    }
}
