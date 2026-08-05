
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Challenge5 {

    // metodo 1 almacena y elimina mltiplos de 3
    public static Set<Integer> filtrarMultiplosDeTres(Set<Integer> entrada) {
        Set<Integer> resultado = new HashSet<>();
        for (Integer numero : entrada) {
            if (numero % 3 != 0) { 
                resultado.add(numero);
            }
        }
        return resultado;
    }

    // metodo 2 almacena y elimina multiplos de 5
    public static Set<Integer> filtrarMultiplosDeCinco(Set<Integer> entrada) {
        Set<Integer> resultado = new TreeSet<>();
        for (Integer numero : entrada) {
            if (numero % 5 != 0) { 
                resultado.add(numero);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Entrada
        Set<Integer> datosHashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> datosTreeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        // filtra
        Set<Integer> setFiltradoTres = filtrarMultiplosDeTres(datosHashSet);
        Set<Integer> setFiltradoCinco = filtrarMultiplosDeCinco(datosTreeSet);

        // fusiona los resultados en un TreeSet 
        Set<Integer> arenaFinal = new TreeSet<>(setFiltradoTres);
        arenaFinal.addAll(setFiltradoCinco);

        
        arenaFinal.forEach(numero -> System.out.println("Number in the arena: " + numero));
    }
}