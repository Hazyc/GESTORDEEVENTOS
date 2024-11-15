package com.example.gestordeeventos;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class AdicionarEventoActivity extends AppCompatActivity {

    MemoryEventoDAO memoryEventoDAO = new MemoryEventoDAO();

    List<Evento> arrayevents = memoryEventoDAO.getALL();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_evento);

        Button botaoConfirmar = findViewById(R.id.botaoConfirmar);

        botaoConfirmar.setOnClickListener(v -> {
            if (addEvent()) {
                finish(); // Fecha a Activity e retorna para a MainActivity
            }
        });



    }




  private boolean addEvent() {

      EditText descricao = findViewById(R.id.descricao);
      String descricaoTexto = descricao.getText().toString();

      EditText local = findViewById(R.id.local);
      String localTexto = local.getText().toString();

      EditText numeroLugares = findViewById(R.id.numeroLugares);
      int numeroLugaresValor = Integer.parseInt(numeroLugares.getText().toString());

      EditText preco = findViewById(R.id.preco);
      double precoValor = Double.parseDouble(preco.getText().toString());

      Button botaoConfirmar = (Button) findViewById(R.id.botaoConfirmar);

      // Crie o evento com as informações capturadas
      Evento novoEvento = new Evento(
              "Tipo de Evento", // Coloque aqui o tipo correto
              descricaoTexto,
              localTexto,
              new Date(), // Defina a data corretamente
              "Hora Evento", // Substitua pela hora correta
              new Date(), // Data limite
              "Hora Limite", // Hora limite
              numeroLugaresValor,
              false, // Defina se for gratuito ou não
              precoValor
      );

      // Adiciona o evento à lista
      arrayevents.add(novoEvento);

      return true;

  }

}



