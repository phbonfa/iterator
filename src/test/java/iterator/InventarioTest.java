package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarLivrosDisponiveisBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("O Nome do Vento", true),
                new Livro("O Hobbit", false),
                new Livro("O Temor do Sábio", true)
        );
        assertEquals(2, Inventario.contarLivrosDisponiveisBiblioteca(biblioteca));
    }

    @Test
    void deveContarTotalLivrosBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("O Nome do Vento", true),
                new Livro("O Hobbit", false),
                new Livro("O Temor do Sábio", true)
        );
        assertEquals(3, Inventario.contarTotalLivrosBiblioteca(biblioteca));
    }
}