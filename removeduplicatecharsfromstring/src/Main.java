
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string = "Jacob Abraham";

        char[] characters = string.toCharArray();

        LinkedList<Character> linkedList = new LinkedList<>();
        for (char c : characters) {
            if (!linkedList.contains(c)) linkedList.add(c);
        }
        char converted[] = new char[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            converted[i] = linkedList.get(i);
        }

        System.out.println("Converted: " + String.valueOf(converted));

    }




}