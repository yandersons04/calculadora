package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        final TextView view_endereco = (TextView) findViewById(R.id.view_endereco);

        Intent intentRecebido = getIntent();
        String enderecof = intentRecebido.getStringExtra("endereco");

        view_endereco.setText(enderecof);

        final TextView view_data = (TextView) findViewById(R.id.view_data);

        Intent intent2Recebido = getIntent();
        String dataf = intent2Recebido.getStringExtra("data");

        view_data.setText(dataf);

        final TextView view_email = (TextView) findViewById(R.id.view_email);

        Intent intent3Recebido = getIntent();
        String emailf = intent3Recebido.getStringExtra("email");

        view_email.setText(emailf);

        final TextView view_telefone = (TextView) findViewById(R.id.view_telefone);

        Intent intent4Recebido = getIntent();
        String telefonef = intent4Recebido.getStringExtra("telefone");

        view_telefone.setText(telefonef);

        final TextView view_cpf = (TextView) findViewById(R.id.view_cpf);

        Intent intent5Recebido = getIntent();
        String cpff = intent5Recebido.getStringExtra("cpf");

        view_cpf.setText(cpff);

        Button inicio = (Button) findViewById(R.id.btn_inicio);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_c.this, Activity_a.class);
                startActivity(intent);
                finish();
            }
        });

        Button calculadora = (Button) findViewById(R.id.btn_calcular);

        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_c.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
