import java.util.HashMap;

public class FindDuplicateCharsInString {

    public static void main(String[] args) {

        String str = "Jacob Abraham";

        HashMap<Character, Integer> map = new HashMap();
        for (int i= 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println("Duplicate character : " + c + " number of times: " + map.get(c));
            }
        }


    }


}
