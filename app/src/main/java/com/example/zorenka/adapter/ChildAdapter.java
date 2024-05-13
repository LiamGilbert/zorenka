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
import com.example.zorenka.server.model.ChildrenEntity;
import com.example.zorenka.server.model.PersonEntity;

import java.util.List;

public class ChildAdapter extends ArrayAdapter<ChildrenEntity> {
    public ChildAdapter(@NonNull Context context, List<ChildrenEntity> list) {
        super(context, R.layout.spin_item_child, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getTemplate(position, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getTemplate(position, parent);
    }

    private View getTemplate(int position, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.spin_item_child, parent, false);

        ChildrenEntity item = getItem(position);

        TextView fullNameView = view.findViewById(R.id.full_name);
        PersonEntity person = item.getPerson();
        fullNameView.setText(
                String.format("%s %s %s", person.getLastname(), person.getName(), person.getPatronymic())
        );

        return view;
    }
}
