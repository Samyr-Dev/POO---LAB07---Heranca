package model.Gerenciamento;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Total: R$" + String.format("%.2f", calcularSalarioTotal()));
        System.out.println();
    }
}
