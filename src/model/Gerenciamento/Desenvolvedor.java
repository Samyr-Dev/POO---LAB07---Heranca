package model.Gerenciamento;

public class Desenvolvedor extends Funcionario{

    private String linguagemPrincipal;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonusPorProjeto;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Desenvolvedor: " + nome);
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Salário Total: R$" + String.format("%.2f", calcularSalarioTotal()));
        System.out.println();
    }
}
