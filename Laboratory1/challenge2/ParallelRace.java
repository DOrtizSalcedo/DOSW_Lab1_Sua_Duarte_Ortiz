import java.util.*;

/**
 * Class that contains various methods.
 * 
 * @author Daniel Felipe Sua Siempira
 * @author Juan Pablo Duarte Silva
 * @author David Felipe Ortiz Salcedo
 */
 
public class ParallelRace {

    public static Results operations(List<Integer> firstList, List<Integer> secondList) {
        listData first = listMethods(firstList);
        listData second = listMethods(secondList);
        
        ParallelRace result = new ParallelRace();
        return result.new Results(first, second);
    }

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

    public static boolean multiplierOrDivisible(Integer maxNumber) {
        return maxNumber % 2 == 0 ? true : false;
    }

    public static String parity(Integer listLength) {
        return listLength % 2 == 0 ? "even" : "odd";
    }

    public static class listData {
        public int max;
        public int min;
        public long size;
        public boolean maxOrDiv;
        public String parity;

        public listData(int max, int min, long size, boolean maxOrDiv, String parity) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.maxOrDiv = maxOrDiv;
            this.parity = parity;
        }

        @Override
        public String toString() {
            return "Max number: " + max + "\nMin number: " + min +
                   "\nSize: " + size + "\nIs multiplier or divisor of 2?: " + maxOrDiv + 
                   "\nParity: " + parity;
        }
    }

    public static listData listMethods(List<Integer> numbers) {
        Integer max = findMaxNumber(numbers);
        Integer min = findMinNumber(numbers);
        long listSize = totalElements(numbers);
        boolean mulOrDiv = multiplierOrDivisible(max);
        String parityResult = parity((int) listSize);

        return new listData(max, min, listSize, mulOrDiv, parityResult);
    }

    public class Results {
        public listData firstResult;
        public listData secondResult;

        public Results(listData firstResult, listData secondResult) {
            this.firstResult = firstResult;
            this.secondResult = secondResult;
        }

        @Override
        public String toString() {
            return "First list:\n" + firstResult + "\nSecond List:\n" + secondResult;
        }
    }

    public static void main(String[] args) {
        List<Integer> firstListNumbers = Arrays.asList(40, 50, 18, 30, 90, 1000);
        List<Integer> secondListNumbers = Arrays.asList(60, 37, 89, 5000, 1200);

        Results listResults = operations(firstListNumbers, secondListNumbers);

        System.out.println(listResults);
    }
}