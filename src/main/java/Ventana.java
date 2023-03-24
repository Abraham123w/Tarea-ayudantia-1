
//Clase Ventana debe mostrar opciones mediante un bucle while:
  //      1.agregar tarea
    //    2.eliminar tarea
      //  3.mostrar todas las tareas existentes
//4.salir del programa
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ventana {
    Scanner sc = new Scanner(System.in);//System.in es la entrada estándar del sistema, que se utiliza para leer los datos de entrada del usuario desde el teclado.
    ListaTarea listaTareas = new ListaTarea();
  public void menu(){
      int opcion = 0;
      while (opcion != 4) {
          // Mostrar opciones
          System.out.println("¿Qué deseas hacer?");
          System.out.println("1. Agregar Tarea");
          System.out.println("2. Eliminar Tarea");
          System.out.println("3. Mostrar Todas Las Tareas");
          System.out.println("4. Salir");

          // Leer opción seleccionada
          System.out.print("Ingresa el número de tu opción: ");
          try {
              opcion = sc.nextInt();
          } catch (InputMismatchException e) {
              System.out.println("Error: el valor introducido no es un número.");
              break;
          }


          // Realizar acción según opción seleccionada
          switch (opcion) {
              case 1:
                  System.out.println("Ingrese la tarea:");
                  String tarea = sc.next();
                  listaTareas.agregarTarea(tarea);
                  System.out.println("Tarea agregada exitosamente");
                  break;
              case 2:
                  System.out.println("Ingrese el número de tarea a eliminar:");
                  int indice = sc.nextInt() - 1;
                  if (indice < 0 || indice >= listaTareas.size()) {
                      System.out.println("Número de tarea inválido");
                  } else {
                      listaTareas.eliminarTarea(indice);
                      System.out.println("Tarea eliminada exitosamente");
                  }
                  break;
              case 3:
                  listaTareas.mostrarTareas();
                  break;
              case 4:
                  System.out.println("Saliendo del programa...");
                  break;
              default:
                  System.out.println("Opción inválida, intenta de nuevo");
                  break;
          }

          // Agregar una pausa en la ejecución para que el usuario pueda leer el resultado
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              Thread.currentThread().interrupt();
          }

          // Limpiar la consola para que se muestre mejor el menú
          System.out.print("\033[H\033[2J");
          System.out.flush();
      }

      // Cerrar scanner
      sc.close();

  }

}