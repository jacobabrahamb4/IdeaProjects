public class RotateArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,6,7,8};
        int k = 3, j;
        while (k > 0) {
            int temp = array[array.length - 1];
            for (j = array.length - 1; j > 0; j --) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
            k --;
        }



    }



}
