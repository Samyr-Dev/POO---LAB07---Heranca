package model.Gestão;

public class Moto extends Veiculo{

    public int cilindrada;
    private String tipoPartida;

    public Moto(String marca, String modelo, int ano, double precoDiaria, int cilindrada, String tipoPartida) {
        super(marca, modelo, ano, precoDiaria);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("=== MOTO ====");
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de partida: " + tipoPartida);
        System.out.println();
    }
}
