import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarea {
    private ArrayList<String> tareas;

    public ListaTarea() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    // el indice empieza de cero??
    public void eliminarTarea(int indice) {
        tareas.remove(indice);
    }

    public void mostrarTareas() {
        System.out.println("Tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + 1 + ". " + tareas.get(i));
        }
    }
    public int size() {
        return tareas.size();
    }
}