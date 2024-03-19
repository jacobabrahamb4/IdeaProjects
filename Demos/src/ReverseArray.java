public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 6, 5, 9, 7, 12, 70};
        int i = 0, j = array.length -1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }



}
