import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println("Left rotated array: " + Arrays.toString(leftRotate(array.clone(), k)));
        System.out.println("Right rotated array: " + Arrays.toString(rightRotate(array, k)));
    }

    /*Left rotate an array.*/
    private static int[] leftRotate(int array[], int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }

    /*Right rotate an array*/
    private static int[] rightRotate(int array[], int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0 ; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        return array;
    }


}