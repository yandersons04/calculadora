package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        final EditText endereco = findViewById(R.id.txt_endereco);
        final EditText data = findViewById(R.id.txt_data);
        final EditText email = findViewById(R.id.txt_email);
        final EditText telefone = findViewById(R.id.txt_telefone);
        final EditText cpf = findViewById(R.id.txt_cpf);

        Button salvar = (Button) findViewById(R.id.btn_salvar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Activity_b.this, Activity_c.class);
                intent2.putExtra("endereco", endereco.getText().toString());
                intent2.putExtra("data", data.getText().toString());
                intent2.putExtra("email", email.getText().toString());
                intent2.putExtra("telefone", telefone.getText().toString());
                intent2.putExtra("cpf", cpf.getText().toString());
                startActivity(intent2);
                finish();
            }
        });

        final TextView txtnome = (TextView) findViewById(R.id.nome);

        Intent intentRecebido = getIntent();
        String nomef = intentRecebido.getStringExtra("nomem");

        txtnome.setText(nomef);

    }
}
