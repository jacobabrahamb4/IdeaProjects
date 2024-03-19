public class CheckRotation {

    public static void main(String[] args) {
        String str1 = "cobJa";
        String str2 = "Jacob";

        String str3 = str1 + str1;

        if (str3.contains(str2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
