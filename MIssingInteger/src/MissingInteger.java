import java.util.HashSet;

public class MissingInteger {

    public static int getLowest(int[] array) {
        int lowest = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] < lowest) lowest = array[i];
        }
        return lowest;
    }

    public static int getLargest(int[] array) {
        int largest = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > largest) largest = array[i];
        }
        return largest;
    }

    public int Solution(int[] A) {
        int lowest = getLowest(A);
        int largest = getLargest(A);
        HashSet<Integer> nums = new HashSet<>();
        for(int i = lowest; i <= largest; i++) {
            if(i == 0) continue;
            nums.add(i);
        }
        for(int a : A) {
            nums.remove(a);
        }
        for (int a:
                A) {
            System.out.println(a);
        }
        return nums.iterator().next();
    }

    public static void main (String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.Solution(new int[]{-2, 1}));
    }


}
