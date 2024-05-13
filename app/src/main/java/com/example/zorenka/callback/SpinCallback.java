package com.example.zorenka.callback;

import android.content.Context;

import com.example.zorenka.view.dialog.MessageDialog;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpinCallback<TEntity> implements Callback<List<TEntity>> {

    private ResponseCallback callback;
    private final Context context;

    public SpinCallback(Context context) {
        this.context = context;
    }

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
        } else {
            MessageDialog dialog = new MessageDialog(context);
            dialog.showDialog("Ошибка!", "Статус ошибки " + response.code());
        }
    }

    @Override
    public void onFailure(Call<List<TEntity>> call, Throwable t) {
        MessageDialog dialog = new MessageDialog(context);
        dialog.showDialog("Ошибка!", "Проверьте подключение к интернету!");
    }
}
