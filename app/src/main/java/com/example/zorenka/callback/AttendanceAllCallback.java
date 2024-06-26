package com.example.zorenka.callback;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.zorenka.adapter.AttendanceAdapter;
import com.example.zorenka.server.StaticFields;
import com.example.zorenka.server.model.AttendanceEntity;
import com.example.zorenka.view.dialog.MessageDialog;

import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AttendanceAllCallback implements Callback<List<AttendanceEntity>> {

    private final Context context;
    private final ListView listView;

    public AttendanceAllCallback(Context context, ListView listView) {
        this.context = context;
        this.listView = listView;
    }

    @Override
    public void onResponse(Call<List<AttendanceEntity>> call, Response<List<AttendanceEntity>> response) {
        if (response.isSuccessful()) {
            List<AttendanceEntity> list =
                    response.body().stream()
                            .filter(x -> x.getChildren().getGroup().getId_person() == StaticFields.Person.getId_person())
                            .collect(Collectors.toList());

            ArrayAdapter<AttendanceEntity> adapter = new AttendanceAdapter(context, list);
            listView.setAdapter(adapter);
        } else {
            MessageDialog dialog = new MessageDialog(context);
            dialog.showDialog("Ошибка!", "Статус ошибки " + response.code());
        }
    }

    @Override
    public void onFailure(Call<List<AttendanceEntity>> call, Throwable t) {
        MessageDialog dialog = new MessageDialog(context);
        dialog.showDialog("Ошибка!", "проверьте подключение с интернетом!");
    }
}
