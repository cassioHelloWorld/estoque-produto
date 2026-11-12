package manager;

import utils.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //inicializando objetos
        ArrayList<Task> tasks = new ArrayList<>();

        Task t1 = new Task(Input.stGui("Digite a descricao da tarefa"));
        Task t2 = new Task(Input.stGui("Digite a descricao da tarefa"), false);
        Task t3 = new Task(Input.stGui("Digite a descricao da tarefa"), false);

        //concluindo tarefas
        int compTask = Input.inGui("Primeira tarefa concluida?\n1-sim\n2-nao");

        do {


            if (compTask == 1) {
                t1.setCompleted(true);
            }
            else if(compTask == 2) {
                t1.setCompleted(false);
            } else{
                Input.msgGui("Valor invalido");
            }
        } while (compTask == 1 || compTask == 2);

        //adicionando tarefas
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

    }
}
