import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public MapPractice() {
        Map<String, Integer> personMap = new HashMap<>();
        personMap.put("Clare", 1000);
        personMap.put("Jerry", 2000);

        // loop hashmap
        for (Map.Entry<String, Integer> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        personMap.forEach((name, income) -> {
            System.out.println("foreach: " + name + ", " + income);
        });
    }

    public static void main(String[] args) {
        new MapPractice();
    }
}
