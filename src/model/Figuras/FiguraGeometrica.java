package model.Figuras;

public abstract class FiguraGeometrica {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Método comum para exibir resultados
    public void exibirResultados() {
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println();
    }
}
