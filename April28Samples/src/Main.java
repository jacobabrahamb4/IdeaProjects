public class Main {
    public static void main(String[] args) {
        int[] array = {7,2,6,0,-4,1,12,10};
        //System.out.println("Count greater: " + countGreater(array));
        System.out.println("rotate : " + rotate2(array, 3));
    }

    public static int countGreater(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) count++;
        }

        return array.length - count;

    }

    public static boolean checkPairs(int[] array, int k) {

        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void reverseArray(int[] array) {
        int temp, i=0, j=array.length-1;

        while(i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
    }

    public static int[] rotate2(int[] A, int B) {
        /*for (int i = 0; i < B; i++) {
            int temp = A[A.length - 1];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j-1];
            }
            A[0] = temp;
        }*/
        reverse(A, 0, A.length - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, A.length - 1);
        return A;
    }

    public static int[] reverse(int[] A, int si, int ei) {
        int i = si, j = ei;
        while(i < j) {
            System.out.println("starting index: " + i + " ending index: " + j);
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

}