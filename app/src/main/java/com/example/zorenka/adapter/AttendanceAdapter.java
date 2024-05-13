package com.example.zorenka.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.zorenka.R;
import com.example.zorenka.server.model.AttendanceEntity;
import com.example.zorenka.server.model.PersonEntity;

import java.util.List;

public class AttendanceAdapter extends ArrayAdapter<AttendanceEntity> {
    public AttendanceAdapter(@NonNull Context context, List<AttendanceEntity> list) {
        super(context, R.layout.item_list_attendance, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_list_attendance, parent, false);

        AttendanceEntity item = getItem(position);

        TextView fullNameView = view.findViewById(R.id.full_name);
        TextView markView = view.findViewById(R.id.mark);
        TextView reasonView = view.findViewById(R.id.reason);
        PersonEntity person = item.getChildren().getPerson();
        String fullName = String.format("%s %s.", person.getLastname(), person.getFirstname().toCharArray()[0]);
        if(person.getPatronymic() != null) {
            fullName += " " + person.getPatronymic().toCharArray()[0] + '.';
        }
        fullNameView.setText(fullName);

        markView.setText(item.getMark());
        if (item.getReason() != null) {
            reasonView.setText(item.getReason().getReason());
        } else {
            reasonView.setText("");
        }

        return view;
    }
}
