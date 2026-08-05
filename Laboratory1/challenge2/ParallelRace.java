import java.util.*;
 
public class ParallelRace {
 
    public static Integer findMaxNumber(List<Integer> numbers) {
        return numbers.stream()
                    .min((a,b) -> a.compareTo(b))
                    .orElse(0);
    }
 
    public static Long totalElements(List<Integer> numbers) {
        return numbers.stream().count();
    }
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(40, 50, 18, 30, 90, 1000);
       
        Integer longNumber = findMaxNumber(listNumbers);
        Long longList = totalElements(listNumbers);
       
        System.out.println("Min number is: " + longNumber);
        System.out.println("Total number of elements are: " + longList);
    }
}