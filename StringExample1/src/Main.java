public class Main {
    public static void main(String[] args) {
        String str = "Jacob Abraham";
        char[] array = str.toCharArray();
        String[] parts = str.split(" ");
        String reverse = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            reverse += parts[i] + " ";
        }
        reverse = reverse.trim();
        System.out.println(reverse);



    }
}