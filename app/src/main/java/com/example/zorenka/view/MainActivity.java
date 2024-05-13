package com.example.zorenka.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zorenka.R;
import com.example.zorenka.callback.LoginCallback;
import com.example.zorenka.server.HttpBuilder;
import com.example.zorenka.server.model.AuthorizationEntity;
import com.example.zorenka.server.model.LoginDto;
import com.example.zorenka.server.repository.AuthRepository;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    private EditText loginView;
    private EditText passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginView = findViewById(R.id.login);
        passwordView = findViewById(R.id.password);

        final Button button = findViewById(R.id.enter_app);

        button.setOnClickListener(this::tryEnterToApplication);
    }

    private void tryEnterToApplication(View v) {
        try {
            enterToApplication();
        } catch (Exception ex) {

        }
    }

    private void enterToApplication() throws Exception {
        String login = loginView.getText().toString();
        String password = passwordView.getText().toString();

        if (login.isEmpty() || password.isEmpty()) {
            throw new Exception();
        }

        LoginDto dto = new LoginDto(login, password);

        HttpBuilder builder = new HttpBuilder();
        AuthRepository repository = builder.createRepository(AuthRepository.class);
        Call<AuthorizationEntity> loginCall = repository.login(dto);
        loginCall.enqueue(new LoginCallback(this));
    }
}