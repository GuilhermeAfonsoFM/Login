package com.example.aluno.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button confirm = (Button) findViewById(R.id.confirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText lgn = (EditText) findViewById(R.id.lgn);
                EditText password = (EditText) findViewById(R.id.password);

                String senha = password.getText().toString();
                String nome = lgn.getText().toString();

                if (nome.equals("adm") && senha.equals("123")){
                    Intent intensao = new Intent(MainActivity.this,Home.class);
                    startActivity(intensao);

                }else{
                    Toast.makeText(getBaseContext(),"Login ou Senha invalido",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
    }
