package main;

import utils.Input;

public class Series {
    //atributos
    private String nome;
    private String plataforma;
    private double nota;

    //construtores

    public Series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma indefinida";
    }


    //setters getters e tostring

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota > 0 && nota <10)
        this.nota = nota;
        else{
            Input.msgGui("Nota invalida");
        }
    }
}
