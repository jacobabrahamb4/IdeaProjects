public class Main {
    public static void main(String[] args) {
        int array[] = {2, -3, 7, -4, 2, 5, -8, 6, -1};
        System.out.println("Max Sum: " + maxSumArray(array));
    }

    /*Returns contiguous sub array with maximum sum*/

    private static int maxSumArray(int array[]) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int tempSum = 0;
            for (int j = i; j < array.length; j++) {
                tempSum += array[j];
                if (tempSum > maxSum) maxSum = tempSum;
            }

        }
        return maxSum;
    }
}