package series;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        //instanciando
        Series s1 = new Series(Input.stGui("Digite o nome da serie"), Input.stGui("Digite o nome da plataforma"));
        Series s2 = new Series(Input.stGui("Digite o nome da serie"));
        Series s3 = new Series(Input.stGui("Digite o nome da serie"));

        //avaliando
        s1.setNota(15);
        s1.setNota(8.5);
        s1.setNota(15);

        //imprimindo variaveis
        Input.msgGui(s1.toString());
        Input.msgGui(s3.toString());
        Input.msgGui(s2.toString());

        //catalogo
        Catalog c1 = new Catalog();

        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.addSeries(s3);

        c1.buscarSerie(Input.stGui("Digite o nome da serie que deseja buscar"));

    }
}
