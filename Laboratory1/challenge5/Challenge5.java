import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    // metodo 1 almacena y elimina multiplos de 3
    public static Set<Integer> filtrarMultiplosDeTres(Set<Integer> entrada) {
        return entrada.stream()
                .filter(numero -> numero % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // metodo 2 almacena y elimina multiplos de 5
    public static Set<Integer> filtrarMultiplosDeCinco(Set<Integer> entrada) {
        return entrada.stream()
                .filter(numero -> numero % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        // Entrada
        Set<Integer> datosHashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> datosTreeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        // filtra
        Set<Integer> setFiltradoTres = filtrarMultiplosDeTres(datosHashSet);
        Set<Integer> setFiltradoCinco = filtrarMultiplosDeCinco(datosTreeSet);

        // fusiona los resultados en un TreeSet 
        Set<Integer> arenaFinal = new TreeSet<>(setFiltradoTres);
        arenaFinal.addAll(setFiltradoCinco);

        // Imprime usando lambda
        arenaFinal.forEach(numero -> System.out.println("Number in the arena: " + numero));
}