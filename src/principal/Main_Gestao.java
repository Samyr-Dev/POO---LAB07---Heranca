package principal;

import model.Gestão.Carro;
import model.Gestão.Moto;

public class Main_Gestao {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 180.0, 4, "Gasolina");
        Moto moto1 = new Moto("Honda", "CB 500", 2022, 120.0, 500, "Elétrica");

        // Exibindo informações dos veículos
        carro1.exibirInformacoes();
        moto1.exibirInformacoes();

        // Calculando custos de locação
        int dias1 = 5;
        int dias2 = 10;

        System.out.println("Custo de locação do carro por " + dias1 + " dias: R$" +
                String.format("%.2f", carro1.calcularCustoLocacao(dias1)));
        System.out.println("Custo de locação do carro por " + dias2 + " dias: R$" +
                String.format("%.2f", carro1.calcularCustoLocacao(dias2)));

        System.out.println();

        System.out.println("Custo de locação da moto por " + dias1 + " dias: R$" +
                String.format("%.2f", moto1.calcularCustoLocacao(dias1)));
        System.out.println("Custo de locação da moto por " + dias2 + " dias: R$" +
                String.format("%.2f", moto1.calcularCustoLocacao(dias2)));
    }
}