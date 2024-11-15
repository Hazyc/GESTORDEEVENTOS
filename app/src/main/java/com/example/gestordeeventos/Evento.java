package com.example.gestordeeventos;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {
    private String tipo;
    private String descricao;
    private String localizacao;
    private Date dataEvento;
    private String horaEvento; //verificar
    private Date dataLimite;
    private String horaLimite;
    private int quantidadesLugares;
    private boolean gratuito;
    private double preco;

    public Evento(String aTipo, String aDescricao, String aLocalizacao, Date aDataEvento, String aHoraEvento,
                  Date aDataLimite, String aHoraLimite, int aQuantidadesLugares, boolean aGratuito, double aPreco ){

        tipo = aTipo;
        descricao = aDescricao;
        localizacao = aLocalizacao;
        dataEvento = aDataEvento;
        horaEvento = aHoraEvento;
        dataLimite = aDataLimite;
        horaLimite = aHoraLimite;
        quantidadesLugares = aQuantidadesLugares;
        gratuito = aGratuito;
        preco = aPreco;
    }
    public String getTipo(){return tipo;
    }
    public void setTipo(String aTipo){
        tipo = aTipo;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String aDescricao){
        descricao = aDescricao;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public void setLocalizacao(String aLocalizacao){
        localizacao = aLocalizacao;
    }

    public Date getDataEvento(){
        return dataEvento;
    }
    public void setDataEvento(Date aDataEvento){
        dataEvento = aDataEvento;
    }
    public String getHoraEvento(){
        return horaEvento;
    }
    public void setHoraEvento(String aHoraEvento){
        horaEvento = aHoraEvento;
    }
    public Date getDataLimite(){
        return dataLimite;
    }
    public void setDataLimite(Date aDataLimite){
        dataLimite = aDataLimite;
    }
    public String getHoraLimite(){
        return horaLimite;
    }
    public void setHoraLimite(String aHoraLimite){
        horaLimite = aHoraLimite;
    }
    public int getQuantidadesLugares(){
        return quantidadesLugares;
    }
    public void setQuantidadesLugares(int aQuantidadesLugares){
        quantidadesLugares = aQuantidadesLugares;
    }
    public boolean isGratuito(){ //é mais comum usar is em vez de get
        return gratuito;
    }
    public void setGratuito(boolean aGratuito){
        gratuito = aGratuito;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double aPreco){
        preco = aPreco;
    }

}
