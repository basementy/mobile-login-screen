package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView loginTextView;
    private Button loginButton;
    private EditText loginUsernameInput;
    private EditText loginPasswordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginTextView = findViewById(R.id.loginTextView);
        loginButton = findViewById(R.id.loginButton);
        loginUsernameInput = findViewById(R.id.editUsername);
        loginPasswordInput = findViewById(R.id.editPassword);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginTextView.setText("");

                String currentUsernameInput = loginUsernameInput.getText().toString();
                String currentPasswordInput = loginPasswordInput.getText().toString();

                if (currentUsernameInput.equals("gabriel.oliveira") && currentPasswordInput.equals("gabriel12345")) {
                    loginTextView.setText("Login efetuado com sucesso!");
                } else {
                    loginTextView.setText("Usuário ou senha inválido.");
                }
            }
        };

        loginButton.setOnClickListener(onClickListener);
    }
}