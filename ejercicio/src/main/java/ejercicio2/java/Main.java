package ejercicio2.java;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Escoja una opción: ");
            int opcion = scanner.nextInt();

            scanner.nextLine(); // consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Escriba el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Escriba el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Escriba el ISBN del libro: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Escriba el año de publicación del libro: ");
                    int anoPublicacion = scanner.nextInt();
                    biblioteca.agregarLibro(new Libro(titulo, autor, ISBN, anoPublicacion));
                    break;
                case 2:
                    System.out.print("Escriba el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    List<Libro> librosPorTitulo = biblioteca.buscarPorTitulo(tituloBuscar);
                    for (Libro libro : librosPorTitulo) {
                        System.out.println(libro.titulo + ", " + libro.autor);
                    }
                    break;
                case 3:
                    System.out.print("Escriba el autor del libro a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    List<Libro> librosPorAutor = biblioteca.buscarPorAutor(autorBuscar);
                    for (Libro libro : librosPorAutor) {
                        System.out.println(libro.titulo + ", " + libro.autor);
                    }
                    break;
                case 4:
                    List<Libro> todosLosLibros = biblioteca.mostrarTodosLosLibros();
                    for (Libro libro : todosLosLibros) {
                        System.out.println(libro.titulo + ", " + libro.autor);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No es válido. Por favor, intente de nuevo.");
            }
        }
    }
}
