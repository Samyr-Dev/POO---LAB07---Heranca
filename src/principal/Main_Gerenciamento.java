package principal;
import model.Gerenciamento.Funcionario;
import model.Gerenciamento.Desenvolvedor;
import model.Gerenciamento.Gerente;

public class Main_Gerenciamento {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Ana Souza", "123.456.789-00", 3000);
        Gerente g1 = new Gerente("Pedro Lucas", "987.654.321-00", 8000, "TI", 20);
        Desenvolvedor d1 = new Desenvolvedor("Pedro", "111.222.333-44", 5000, "Java", 1500);

        // Exibindo informações e salários
        f1.exibirInformacoes();
        g1.exibirInformacoes();
        d1.exibirInformacoes();

    }
}