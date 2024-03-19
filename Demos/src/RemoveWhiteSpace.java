public class RemoveWhiteSpace {

    public static void main(String[] args) {
        /*String str = "Jacob Abraham";
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);*/
        removeWhiteSpace();
    }

    public static void removeWhiteSpace() {
        String str = "Jacob Abraham";
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ' ' && chars[i] != '\t') {
                stringBuffer.append(chars[i]);
            }
        }
        System.out.println(stringBuffer);
    }


}
