package model.Produtos;

public class Livro extends Produto{

    private String autor;
    private String isbn;

    public Livro(String nome, double preco, String codigoBarras, String autor, String isbn) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== LIVRO ===");
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}
