package model.Figuras;

public class Circulo extends FiguraGeometrica{


    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirResultados(){
        System.out.println("=== CÍRCULo ===");
        System.out.println("Raio: " + raio);
        super.exibirResultados();
    }

}
