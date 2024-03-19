import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "Jacob Abraham";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> e: map.entrySet()) {
            if(e.getValue() == 1) {
                System.out.println(e.getKey());
            }
        }
    }
}
