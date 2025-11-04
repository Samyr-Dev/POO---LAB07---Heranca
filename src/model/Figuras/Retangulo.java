package model.Figuras;

public class Retangulo extends FiguraGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public void exibirResultados() {
        System.out.println("=== RETÂNGULO ===");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        super.exibirResultados();
    }
}
