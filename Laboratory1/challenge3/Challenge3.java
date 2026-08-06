import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge3 {

    // StringBuilder method - to repeat x3
    public static String repeatThreeTimes(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text).append(" ").append(text).append(" ").append(text);
        return sb.toString();
    }

    // method to reverse the words 
    public static String reverseText(String text) {
        StringBuffer sb = new StringBuffer(text);
        return sb.reverse().toString();
    }

    // It takes both messages, repeats them, and reverses them.
    public static Function<String[], String> echoProcess = mensajes -> {
        // Repeat
        String resultadoRepetido = IntStream.range(0, mensajes.length)
                .mapToObj(i -> repeatThreeTimes(mensajes[i]))
                .collect(Collectors.joining(" "));

        // Invest
        StringBuffer buffer = new StringBuffer(resultadoRepetido);
        return buffer.reverse().toString();
    };

    public static void main(String[] args) {
        System.out.println("Repetir: " + repeatThreeTimes("Hola"));
        System.out.println("Invertir: " + reverseText("Yo"));

        String[] entradas = {"Hola", "Yo"};
        System.out.println("\nResultado:");
        System.out.println(echoProcess.apply(entradas)); 
    }
}