import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sortedArray1[] = {-7, 12, 17, 29, 41, 56, 79};
        int sortedArray2[] = {-9, -3, 0, 5, 19};

        System.out.println("Merged array: " + Arrays.toString(getMergedArray(sortedArray1, sortedArray2)));

    }

    private static int[] getMergedArray(int sortedArray1[], int sortedArray2[]) {
        int mergedArray[] = new int[sortedArray1.length + sortedArray2.length];

        for (int i = 0; i < sortedArray1.length; i++) {
            mergedArray[i] = sortedArray1[i];
        }

        for (int i = 0; i < sortedArray2.length; i++) {
            mergedArray[sortedArray1.length - 1 + i] = sortedArray2[i];
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }

}