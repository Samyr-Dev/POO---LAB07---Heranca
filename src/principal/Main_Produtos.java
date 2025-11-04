package principal;

import model.Produtos.Eletronico;
import model.Produtos.Livro;
import model.Produtos.Roupa;

public class Main_Produtos {
    public static void main(String[] args) {
        Eletronico e1 = new Eletronico("Smartphone", 2500.00, "7891234567890", "Samsung", "Bivolt");
        Livro l1 = new Livro("Clean Code", 120.00, "9780132350884", "Robert C. Martin", "0132350882");
        Roupa r1 = new Roupa("Camiseta Básica", 79.90, "9876543210987", "M", "Algodão");

        // Exibindo detalhes dos produtos
        e1.exibirDetalhes();
        l1.exibirDetalhes();
        r1.exibirDetalhes();
    }
}
