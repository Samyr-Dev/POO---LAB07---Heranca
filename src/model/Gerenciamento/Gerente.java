package model.Gerenciamento;

    public class Gerente extends Funcionario{

        private String departamento;
        private double bonificacaoPercentual;

        public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
            super(nome, cpf, salarioBase);
            this.departamento = departamento;
            this.bonificacaoPercentual = bonificacaoPercentual;
        }

        @Override
        public double calcularSalarioTotal() {
            double bonificacao = salarioBase * (bonificacaoPercentual / 100);
            return salarioBase + bonificacao;
        }

        @Override
        public void exibirInformacoes() {
            System.out.println("Gerente: " + nome);
            System.out.println("Departamento: " + departamento);
            System.out.println("Salário Total: R$" + String.format("%.2f", calcularSalarioTotal()));
            System.out.println();
        }
    }
