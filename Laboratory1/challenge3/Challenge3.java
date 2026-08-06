import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge3 {

    // mtodo para repite el texto 
    public static String repeatThreeTimes(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text).append(" ").append(text).append(" ").append(text);
        return sb.toString();
    }

    // lambda para el efecto de Eco
    public static Function<String, String> echoProcess = mensaje -> {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        StringBuilder builder = new StringBuilder(repetido);
        return builder.reverse().toString();
    };

    public static void main(String[] args) {
        System.out.println("Repeticion:");
        System.out.println(repeatThreeTimes("Hola"));

        System.out.println("\nEfecto cin Eco - Parte 1:");
        System.out.println(echoProcess.apply("Sol"));
    }
}