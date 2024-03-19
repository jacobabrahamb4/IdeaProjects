public class Main {
    public static void main(String[] args) {
        int array[] = {15, 51, 7, 81, 5, 11, 25};
        System.out.println("Result: " );
        findSubArraySum(array, 15);
    }

    private static void findSubArraySum(int array[], int number) { // the sub array sum continuous

        for (int i = 0; i < array.length; ++i) {
            int sum = 0;
            for (int j = i; j < array.length; ++j) {
                sum = sum + array[i];
                if (sum == number) {
                    for (int k = i; k < j; ++k) {
                        System.out.print(array[k] + ", ");
                    }
                    break;
                } else if (sum > number) break;
            }
        }
    }


}

