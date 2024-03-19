import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jacob Abraham");
        System.out.println(sb.reverse());
        System.out.println("Hello world!");
        /*HashMap<Character, Integer> hm = new HashMap<>();
        char[] chars = sb.toString().toCharArray();
        for (char c : chars) {
            hm.put(c, hm.get(c) + 1);
        }*/

        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        System.out.println(Arrays.equals(s1, s2));

        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();

        StringBuilder bs1 = new StringBuilder("Hello Jacob");

        int[] array = {4, 7, 12, 8, 3, 11};
        Arrays.sort(array);
        for (int i = 0 ; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}