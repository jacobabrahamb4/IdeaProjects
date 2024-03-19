public class Test {

    public static void main(String[] args) {
        test();
    }

    public static void test () {
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
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }



}
