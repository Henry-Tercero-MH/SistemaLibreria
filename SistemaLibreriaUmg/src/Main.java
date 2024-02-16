import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista();
        while (true) {
            menu();
            int op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                    //agregar datos del nuevo alumno
                    System.out.println("Digite el nombre: ");
                    String nombre = entrada.nextLine().toLowerCase();
                    System.out.println("Digite el telefono: ");
                    String tel = entrada.nextLine();
                    System.out.println("Digite el carne: ");
                    String carne = entrada.nextLine();
                    Alumno alumno = new Alumno(nombre, tel, carne);
                    System.out.println( alumno.toString());
                    lista.agregarAlumno(alumno);
                    break;
                case 2:
                    //buscar alumno
                    System.out.println(".:Buscador:.");
                    System.out.println("Ingrese el nombre o carne");
                    String var = entrada.nextLine().toLowerCase();
                    lista.buscarAlumno(var);
                    break;
                case 3:
                    //eliminar alumno
                    System.out.println("Ingrese el nombre o carnet a eliminar: ");
                    var = entrada.nextLine();
                    lista.eliminarAlumnos(var);
                    break;
                case 4:
                    //mostrar todos los alumnos
                    lista.mostrarDatosLista();
                    break;
                case 5:
                    System.exit(0);
                default:

            }


        }
    }

    public static void menu() {
        System.out.println("         .:UMG:.    ");
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Buscar por Nombre o Carne");
        System.out.println("3. Eliminar Alumno");
        System.out.println("4. Mostrar Alumnos");
        System.out.println("5. Salir");
        System.out.println("Elije una Opcion:");
    }
}