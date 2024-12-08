package outrosDoisExercicios;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(int numero, String conteudo) {
        Pagina novaPagina = new Pagina(numero, conteudo);
        paginas.add(novaPagina);
    }

    public void mostrarLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Conteúdo do outrosDoisExercicios.Livro:");
        for (Pagina pagina : paginas) {
            System.out.println(pagina);
        }
    }
}