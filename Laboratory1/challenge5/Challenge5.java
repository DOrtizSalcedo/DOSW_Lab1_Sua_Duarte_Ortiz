import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    // metodo 1 almacena y elimina multiplos de 3
    public static Set<Integer> filterMultiplesOfThree(Set<Integer> input) {
        return input.stream()
                .filter(number -> number % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // metodo 2 almacena y elimina multiplos de 5
    public static Set<Integer> filterMultiplesOfFive(Set<Integer> input) {
        return input.stream()
                .filter(number -> number % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        // Entrada
        Set<Integer> hashSetData = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSetData = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        // filtra
        Set<Integer> filteredSetThree = filterMultiplesOfThree(hashSetData);
        Set<Integer> filteredSetFive = filterMultiplesOfFive(treeSetData);

        // fusiona los resultados en un TreeSet 
        Set<Integer> finalArena = new TreeSet<>(filteredSetThree);
        finalArena.addAll(filteredSetFive);

        // Imprime usando lambda
        finalArena.forEach(number -> System.out.println("Number in the arena: " + number));
    }
}