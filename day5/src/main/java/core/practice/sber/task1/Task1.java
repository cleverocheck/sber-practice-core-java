package core.practice.sber.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static <K, V> Map<V, K> swapMap(Map<K, V> input) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : input.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("apple", 1);
        originalMap.put("banana", 2);
        originalMap.put("orange", 3);
        originalMap.put("grape", 4);

        System.out.println("Исходная Map<K, V>: " + originalMap);

        Map<Integer, String> swappedMap = swapMap(originalMap);
        System.out.println("После swapMap Map<V, K>: " + swappedMap);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(10, "ten");
        map2.put(20, "twenty");
        map2.put(30, "thirty");

        System.out.println("Исходная Map<Integer, String>: " + map2);

        Map<String, Integer> swappedMap2 = swapMap(map2);
        System.out.println("После swapMap Map<String, Integer>: " + swappedMap2);
    }
}