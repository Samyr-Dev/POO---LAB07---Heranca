package model.Gestão;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoDiaria;

    public Veiculo(String marca, String modelo, int ano, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    //Método que calcula o custo total de locação
    public double calcularCustoLocacao(int dias){
        return dias * precoDiaria;
    }

    //Método para exibir informações básicas do veículo
    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço diária: R$" + String.format("%.2f", precoDiaria));
    }
}
