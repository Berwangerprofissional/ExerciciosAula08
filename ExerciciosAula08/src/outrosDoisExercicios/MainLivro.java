package outrosDoisExercicios;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Avançado", "John Doe");

        livro.adicionarPagina(1, "Introdução ao Java");
        livro.adicionarPagina(2, "Conceitos de Orientação a Objetos");
        livro.adicionarPagina(3, "Encapsulamento, Herança e Polimorfismo");

        livro.mostrarLivro();
    }
}