public class FindSmallestAndLargest {

    public static void main(String[] args) {
        int[] array = new int[] {10, 23, 12, 34, 23, 45, 52, 24};
        int smallest = array[0];
        int largest = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > largest) largest = array[i];
            else if(array[i] < smallest) smallest = array[i];
        }

        System.out.println("Smallest: " + smallest + " largest: " + largest);



    }



}
