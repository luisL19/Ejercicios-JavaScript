package ejercicio2.java;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.titulo.contains(titulo)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.autor.contains(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libro> mostrarTodosLosLibros() {
        return libros;
    }
}
