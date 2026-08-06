import java.util.*;

/**
 * Class that contains various methods.
 * 
 * @author Daniel Felipe Sua Siempira
 * @author Juan Pablo Duarte Silva
 * @author David Felipe Ortiz Salcedo
 */
 
public class ParallelRace {
    public static Integer findMinNumber(List<Integer> numbers) {
        return numbers.stream()
                    .min((a,b) -> a.compareTo(b))
                    .orElse(0);
    }

    public static Integer findMaxNumber(List<Integer> numbers) {
        return numbers.stream()
                    .max((a,b) -> a.compareTo(b))
                    .orElse(0);
    }

    public static Long totalElements(List<Integer> numbers) {
        return numbers.stream().count();
    }

    public static boolean maxDivisible(Integer maxNumber) {
        return maxNumber % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(40, 50, 18, 30, 90, 1000);
       
        Integer longNumber = findMaxNumber(listNumbers);
        Integer smallNumber = findMinNumber(listNumbers);
        Long longList = totalElements(listNumbers);
        boolean divisible = maxDivisible(longNumber);

        System.out.println("Max number is: " + longNumber);
        System.out.println("Min number is: " + smallNumber);
        System.out.println("Total number of elements are: " + longList);
        System.out.println(divisible);
    }
}