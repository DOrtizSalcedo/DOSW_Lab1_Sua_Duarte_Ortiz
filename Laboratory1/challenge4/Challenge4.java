import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Challenge4 {

    private Map<String, Integer> hashMap = new HashMap<>();
    private Map<String, Integer> hashtable = new Hashtable<>();

    // HashMap
    public void storeInHashMap(String clave, Integer valor) {
        hashMap.putIfAbsent(clave, valor);
    }

    // Hashtable
    public void storeInHashtable(String clave, Integer valor) {
        hashtable.putIfAbsent(clave, valor);
    }

    // fusion de ambos
    public Map<String, Integer> mergeMaps() {
        Map<String, Integer> merged = new HashMap<>(hashMap);
        merged.putAll(hashtable); // prioridad en duplicados

        return merged.entrySet().stream()
            .collect(Collectors.toMap(
                e -> e.getKey().toUpperCase(),
                Map.Entry::getValue,
                (v1, v2) -> v2,
                TreeMap::new
            ));
    }

    public static void main(String[] args) {
        Challenge4 challenge = new Challenge4();

        challenge.storeInHashMap("gold", 5);
        challenge.storeInHashMap("silver", 3);
        challenge.storeInHashMap("gold", 7); 
        challenge.storeInHashMap("diamond", 10);

        challenge.storeInHashtable("silver", 8);
        challenge.storeInHashtable("ruby", 4);
        challenge.storeInHashtable("gold", 12);
        challenge.storeInHashtable("emerald", 6);

        Map<String, Integer> result = challenge.mergeMaps();

        result.forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));
    }
}