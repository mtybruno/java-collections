package TaskList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    // add new arrylist to add tasks
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();   
    }

    // add new Tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    
    //remove a task from the description in the list
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    // get the total number of tasks
    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    //get description of the task list
    public void obterDescricoesTarefas () {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero total de elementos " + listaTarefa.obterTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        System.out.println("Numero total de elementos " + listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}