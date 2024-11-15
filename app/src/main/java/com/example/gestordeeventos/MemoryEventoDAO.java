package com.example.gestordeeventos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryEventoDAO implements EventoDAO {
    private List<Evento> eventos = new ArrayList<>();
    private int lastId = 0; //ultimo ID usado para identificar eventos

    @Override
    public List<Evento> getALL(){
        return eventos; //retorna todos os eventos
    }

    //procura um evento por ID
    @Override
    public Evento getById(int id){
        for (Evento evento : eventos){
            if (evento.getQuantidadesLugares() == id)
                return evento;
        }
        return null;
    }
    //Adiciona um novo evento e define um ID
    @Override
    public boolean add(Evento evento) {
        evento.setQuantidadesLugares(++lastId); //Usa qauntidade de lugares com ID temporariamente
        eventos.add(evento);
        return true;
    }
    //atualizar evento
    @Override
    public boolean update(Evento evento) {
        Evento atual = getById(evento.getQuantidadesLugares());
        if (atual == null) {
            return false;
        }
        atual.setTipo(evento.getTipo());
        atual.setDescricao(evento.getDescricao());
        atual.setLocalizacao(evento.getLocalizacao());
        atual.setDataEvento(evento.getDataEvento());
        atual.setHoraEvento(evento.getHoraEvento());
        atual.setDataLimite(evento.getDataLimite());
        atual.setHoraLimite(evento.getHoraLimite());
        atual.setQuantidadesLugares(evento.getQuantidadesLugares());
        atual.setGratuito(evento.isGratuito());
        atual.setPreco(evento.getPreco());
        return true;
    }
    @Override
    //Apagar um evento pelo ID
    public boolean delete(int id){
        Evento atual = getById(id);
        if (atual == null){
            return false;
        }
        eventos.remove(atual);
        return true;
    }

}
