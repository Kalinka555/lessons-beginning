package lessons.lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Grusha", 2);
        fridge.put("Sliva", 5);
        fridge.put("Apple", 3);


        fridge.put("Grusha", 6 + fridge.get("Grusha"));

        int weight = 0;
        for (Integer value : fridge.values()) {
            weight = weight + value;
        }

        Set<Map.Entry<String, Integer>> entries = fridge.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


        System.out.println(weight);
        System.out.println(fridge);
    }
}
