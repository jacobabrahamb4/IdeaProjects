import java.util.Arrays;

public class CheckAnagrams {

    public static void main(String[] args) {
        String str1 = "Jacob Abraham";
        String str2 = "maharbA bocaJ";
        String s1 = str1.replaceAll(" ", "");
        String s2 = str2.replaceAll(" ", "");
        boolean status = false;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] array1 = s1.toLowerCase().toCharArray();
            char[] array2 = s2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            status = Arrays.equals(array1, array2);
        }

        if(status) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }





    }
}
