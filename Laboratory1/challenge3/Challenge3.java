import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge3 {

    // metodo 2 para invertir el mensaje
    public static String reverseText(String text) {
        StringBuffer sb = new StringBuffer(text);
        return sb.reverse().toString();
    }

    // ambda para el  Eco
    public static Function<String, String> echoProcess = mensaje -> {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        StringBuffer buffer = new StringBuffer(repetido);
        return buffer.reverse().toString();
    };

    public static void main(String[] args) {
        System.out.println("Inversiion de la palabra:");
        System.out.println(reverseText("Hola"));

        System.out.println("\nEfecto Eco - Parte 2:");
        System.out.println(echoProcess.apply("Yo"));
    }
}