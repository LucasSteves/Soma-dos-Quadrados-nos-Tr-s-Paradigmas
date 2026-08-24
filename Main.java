import java.util.List;

class SomaQuadrados {

    private final List<Integer> numeros;

    public SomaQuadrados(List<Integer> numeros) {
        this.numeros = numeros;
    }

    private int quadrado(int n) {
        return n * n;
    }

    public int calcular() {
        int soma = 0;
        for (int n : numeros) {
            soma += quadrado(n);
        }
        return soma;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4);

        SomaQuadrados calculadora = new SomaQuadrados(numeros);
        int resultado = calculadora.calcular();

        System.out.println("Soma dos quadrados: " + resultado);
    }
}
