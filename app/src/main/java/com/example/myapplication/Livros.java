package com.example.myapplication;

public class Livros {

    String tituloAt;
    String subtituloAt;
    public Livros(){
    }
    public Livros(String t, String st){
        this.tituloAt = t;
        this.subtituloAt = st;
    }

    public void setTitulo(String ttl){

        this.tituloAt = ttl;
    }

    public void setSubtitulo(String stl){
        this.subtituloAt = stl;
    }

    public String getTitulo(){
        return tituloAt;
    }
    public String getSubtitulo(){
        return subtituloAt;
    }


}
