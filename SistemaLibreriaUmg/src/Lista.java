import java.util.LinkedList;
public class Lista {
    //creamos una lista enlazada
    LinkedList<Alumno> lista = new LinkedList<>();

    //metodo para agregar un alumno
    public void agregarAlumno(Alumno alumno) {
        lista.add(alumno);

    }

//metodo para buscar un alumno por nombre o carne
    public void buscarAlumno(String dato) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < lista.size(); i++) {
                Alumno alumno = lista.get(i);
                if (alumno.getNombre().equalsIgnoreCase(dato) || alumno.getCarne().equalsIgnoreCase(dato)) {
                    System.out.println("Datos del Alumno: " + alumno.toString());
                    encontrado = true;
                    break;  // Salir del bucle al encontrar el alumno
                }
            }
            if (!encontrado) {
                System.out.println("Alumno no encontrado.");
            }
        }
    }
//metodo para eliminar alumno
    public void eliminarAlumnos(String dato) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < lista.size(); i++) {
                Alumno alumno = lista.get(i);
                if (alumno.getNombre().equalsIgnoreCase(dato) || alumno.getCarne().equalsIgnoreCase(dato)) {
                    System.out.println("Datos del Alumno: " + alumno.toString());
                    lista.remove(i);
                    System.out.println("Se elimino con Exito!");
                    encontrado = true;
                    i--;
                    break;  // Salir del bucle al encontrar el alumno
                }
            }
            if (!encontrado) {
                System.out.println("Alumno no encontrado.");
            }
        }
    }
//metodo mostrar datos de la lista
    public void mostrarDatosLista() {
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos agregados");
        }
        for (int i = 0; i < lista.size(); i++) {
            Alumno alumno = lista.get(i);
            System.out.println(alumno.toString());
        }
    }


}

