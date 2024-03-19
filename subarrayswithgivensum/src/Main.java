public class Main {
    public static void main(String[] args) {
        int array[] = {7, 3, 6, 5, 21, -6, -15, 28, 8};
        int sum = 21;



        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[i];
                if (currentSum == sum) {
                    System.out.println("Matched: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(array[k] + ", ");
                    }
                    System.out.println("\n");
                }
            }

        }




        System.out.println(" ");
    }
}