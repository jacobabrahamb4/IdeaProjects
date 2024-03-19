public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArray = {"java2blog", "javaworld", "javabean", "javatemp"};
        String longestPrefix = getLongestCommonPrefix(strArray);
        System.out.println("Longest Common Prefix: " + longestPrefix);
    }

    private static String getLongestCommonPrefix(String[] strArray) {
        if(strArray.length == 0) return "";
        String minString = getMinString(strArray);
        int minPrefixStringLength = minString.length();
        for (int i = 0; i < strArray.length; i++) {
            int j;
            for (j = 0; j < minPrefixStringLength; j++) {
                if (minString.charAt(j) != strArray[i].charAt(j)) {
                    break;
                }
            }
            if ( j < minPrefixStringLength) {
                minPrefixStringLength = j;
            }
        }
        return  minString.substring(0, minPrefixStringLength);
    }

    private static String getMinString(String[] strArray) {
        String minString = strArray[0];
        for(int i = 1; i < strArray.length; i++) {
            if(strArray[i].length() < minString.length()) {
                minString = strArray[i];
            }
        }
        return minString;
    }


}
