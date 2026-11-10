package main;

import utils.Input;

import java.util.ArrayList;

public class Catalogo {
    //lista
    ArrayList<Series> lista = new ArrayList<>();

    //metodos
    public void addSeries (Series s){
        lista.add(s);
    }

    public Series buscarSerie (String nomeBusca){
        for (Series s : lista){
            if(s.getNome().equalsIgnoreCase(nomeBusca)){
                Input.msgGui("A serie esta dispinivel na "+s.getPlataforma()+" e tem nota "+s.getNota());
                return s;
            }
        }return null;
    }
}
