import java.util.*;

public class ParallelRace {

    public static Integer findMaxNumber(List<Integer> numbers) {
        return numbers.stream()
                    .max((a,b) -> a.compareTo(b))
                    .orElse(0);
    }
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(40, 50, 18, 30, 90, 1000);
       
        Integer longNumber = findMaxNumber(listNumbers);
        
        System.out.println("Max number is: " + longNumber);
    }
}