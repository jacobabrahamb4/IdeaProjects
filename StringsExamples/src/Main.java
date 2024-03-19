import java.util.*;

public class Main {

    public static String longestPalindrome(String A) {
        int N = A.length();
        String ans = "";
        for (int i = 0; i < N; i++) {
            int P1 = i, P2 = i;
            ans = expand(A, P1, P2, ans);
        }
        return ans;
    }

    public static String expand(String A, int P1, int P2, String current) {
        System.out.println("P1: " + P1 + " P2: " + P2);
        char[] s = A.toCharArray();
        while(P1 >= 0 && P2 < s.length && s[P1] == s[P2]) {
            P1--;
            P2++;
        }
        System.out.println("--> P1: " + P1 + " P2: " + P2);
        if ((P2-P1-1) > current.length()) {
            return A.substring(P1 + 1, P2 - 1);
        }
        else return current;
    }

    public static int repeating(int[] A) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            Integer count = hm.get(A[i]);
            hm.put(A[i], (count == null ? 0 : count) + 1);
        }
        System.out.println(hm.toString());
        for (int i = 0; i < A.length; i++) {
            if(hm.get(A[i]) > 1) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] A = {10,5,3,4,3,5,6};
        System.out.println(repeating(A));
        HashSet hs = new HashSet();
        hs.
    }
}