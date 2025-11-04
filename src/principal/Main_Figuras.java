package principal;

import model.Figuras.Circulo;
import model.Figuras.Retangulo;
import model.Figuras.Triangulo;

public class Main_Figuras {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);
        Retangulo r1 = new Retangulo(4.0, 6.0);
        Triangulo t1 = new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0);

        // Exibindo resultados
        c1.exibirResultados();
        r1.exibirResultados();
        t1.exibirResultados();
    }
}