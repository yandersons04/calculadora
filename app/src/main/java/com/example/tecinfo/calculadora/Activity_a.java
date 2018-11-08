package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        final EditText nome = findViewById(R.id.txt_nome);

        Button cadastrar = (Button) findViewById(R.id.btn_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_a.this, Activity_b.class);
                intent.putExtra("nomem", nome.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        Button login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_a.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
