package model.Gestão;

public class Carro extends Veiculo{

    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double precoDiaria, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("=== CARRO ====");
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas + "cc");
        System.out.println("Tipo de combustível: " + tipoCombustivel);
        System.out.println();
    }
}
