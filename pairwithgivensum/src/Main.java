public class Main {
    public static void main(String[] args) {
        int array[] = {12, 23, 125, 41, -75, 38, 27, 11};

        findPairs(array, 50);

    }

    private static void findPairs(int array[], int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println("Pair found: " + array[i] + ", " + array[j]);
                }
            }
        }
    }

}