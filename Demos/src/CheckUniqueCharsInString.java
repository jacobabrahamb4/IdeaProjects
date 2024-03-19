import java.util.HashSet;

public class CheckUniqueCharsInString {

    public static void main(String[] args) {
        String word = "Jacob Abraham";
        HashSet set = new HashSet();
        for (int index = 0; index < word.length(); index++) {
            char c = word.charAt(index);
            if (!set.add(c)) {
                System.out.println("FALSE");
                return;
            }
        }
    }
}
