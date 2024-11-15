package com.example.gestordeeventos;

import java.util.List;

public interface EventoDAO {
    public List<Evento> getALL();
    public Evento getById(int id);
    public boolean add(Evento evento);
    public boolean update(Evento evento);
    public boolean delete(int id);
}
