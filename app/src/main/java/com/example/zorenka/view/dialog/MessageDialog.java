package com.example.zorenka.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.zorenka.R;

public class MessageDialog extends Dialog {
    private final TextView title;
    private final TextView description;
    public MessageDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.message_dialog);
        setCancelable(true);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
    }

    public void showDialog(String title, String description) {
        this.title.setText(title);
        this.description.setText(description);
        show();
    }
}
