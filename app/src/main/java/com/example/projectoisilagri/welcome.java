package com.example.projectoisilagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //btn que va a registro
        Button registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(welcome.this, RegisterAct.class);
                    startActivity(intent);
            }
        });

        //btn que va a login
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        //CREAR BOTON PARA LLEVAR A OTRO ACTIVITY
        //Button guestButton = findViewById(R.id.guestButton);
        //guestButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
                // Navegar a la actividad de invitado
        //        Intent intent = new Intent(WelcomeActivity.this, InvitadoActivity.class);
        //        startActivity(intent);
        //    }
        //});
    }
}