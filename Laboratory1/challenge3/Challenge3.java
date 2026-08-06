import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge3 {

    // mtodo StringBuilder
    public static String repeatThreeTimes(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text).append(" ").append(text).append(" ").append(text);
        return sb.toString();
    }

    public static Function<String, String> echoProcess = mensaje -> {
        return IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));
    };

    public static void main(String[] args) {
        System.out.println(repeatThreeTimes("Hola"));
        System.out.println(echoProcess.apply("Sol"));
    }
}