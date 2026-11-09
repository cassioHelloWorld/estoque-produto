package main;

import utils.Input;

public class Main {
    static void main(String[] args) {
        //instanciando
        Series s1 = new Series(Input.stGui("Digite o nome da serie"), Input.stGui("Digite o nome da plataforma"));
        Series s2 = new Series(Input.stGui("Digite o nome da serie"));
        Series s3 = new Series("TrancasDoCareca");

        //avaliando
        s1.setNota(15);
        s1.setNota(8.5);

        //catalogo
        Catalogo c1 = new Catalogo();

        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.addSeries(s3);

        c1.buscarSerie("TrancasDoCareca");

    }
}
