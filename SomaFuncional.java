import java.util.List;

public class SomaFuncional {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4);

        int resultado = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Soma dos quadrados: " + resultado);
    }
}
