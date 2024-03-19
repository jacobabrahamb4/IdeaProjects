import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String string = "AABBCC";
        char array[] = string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : array) {
            if (!list.contains(c)) {
                list.add(c);
            } else {
                System.out.println("Contains duplicates");
                return;
            }
        }
        System.out.println("Doesn't contain duplicates.");
    }

}