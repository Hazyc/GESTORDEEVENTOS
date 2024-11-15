package com.example.gestordeeventos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Evento> eventoList = new ArrayList<>();
    private MemoryEventoDAO eventoDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoAdicionar = (Button) findViewById(R.id.button_add);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewEventos);

        // Configuração do RecyclerView e Adapter
        RecyclerAdapter adapter = new RecyclerAdapter(this, eventoList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Preenche a lista dos eventos para exibir no RecyclerView
        setUpEvento();


        botaoAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarActivityAdicionar();
            }
        });

        MemoryEventoDAO eventoDAO = new MemoryEventoDAO();
        eventoList = eventoDAO.getALL();



    }

    private void setUpEvento() {
        eventoList.add(new Evento("Cultural", "Stand up comedy – Mike Sheer", "Restaurante Alma do Raio - Braga", new Date(), "21:00", new Date(), "20:00", 0, false, 10.00));
        eventoList.add(new Evento("Gastronómico", "Clube Vinhos e Champanhe - Guimarães", "Quinta de Castelães", new Date(), "19:00", new Date(), "18:00", 50, true, 0.0));
        // eventos teste
    }





    private void mudarActivityAdicionar(){
        Intent intent = new Intent(this, AdicionarEventoActivity.class);
        startActivity(intent);
    }


}