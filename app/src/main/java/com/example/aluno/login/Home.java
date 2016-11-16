package com.example.aluno.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by aluno on 27/09/2016.
 */
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Toast.makeText(getBaseContext(),"Bem vindo",Toast.LENGTH_LONG).show();

        String[] nomes = {"Jose","Matheus","Guilherme","Jackson"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nomes);

        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(adapter);

    }
}
