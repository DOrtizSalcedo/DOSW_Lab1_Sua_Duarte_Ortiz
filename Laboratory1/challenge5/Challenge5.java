import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    // Method 1 stores and removes multiples of 3.
    public static Set<Integer> filterMultiplesOfThree(Set<Integer> input) {
        return input.stream()
                .filter(number -> number % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // Method 2 stores and removes multiples of 5.
    public static Set<Integer> filterMultiplesOfFive(Set<Integer> input) {
        return input.stream()
                .filter(number -> number % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        // input
        Set<Integer> hashSetData = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSetData = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        // filter
        Set<Integer> filteredSetThree = filterMultiplesOfThree(hashSetData);
        Set<Integer> filteredSetFive = filterMultiplesOfFive(treeSetData);

        // merge the results into a TreeSet
        Set<Integer> finalArena = new TreeSet<>(filteredSetThree);
        finalArena.addAll(filteredSetFive);

        // Print using lambda
        finalArena.forEach(number -> System.out.println("Number in the arena: " + number));
    }
}