import java.util.function.Function;

public class Challenge3 {

    // metodo con StringBuffer
    public static String reverseText(String text) {
        StringBuffer sb = new StringBuffer(text);
        return sb.reverse().toString();
    }

    public static Function<String, String> echoProcess = mensaje -> {
        StringBuffer buffer = new StringBuffer(mensaje);
        return buffer.reverse().toString();
    };

    public static void main(String[] args) {
        System.out.println(reverseText("Hola"));
        System.out.println(echoProcess.apply("Yo"));
    }
}